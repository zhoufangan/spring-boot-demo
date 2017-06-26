package com.zhoufa.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Created by zhoufangan on 2017/6/22.
 */
@Service
public class RedisBillLock {

    @Autowired
    private RedisService redisService;

    /**
     * 读写锁 读可有多个线程访问 写只能由一个线程访问
     * tryReadWriteLock()，拿不到lock，就等一段时间，超时返回false。
     *
     * @param key                 key
     * @param maxTryLockSeconds   锁定的失效时间 单位：秒
     * @param maxLifeCycleSeconds 锁最大生命周期 单位：秒
     * @return 成功true，失败false
     */
    public boolean tryReadWriteLock(String key, long maxTryLockSeconds, int maxLifeCycleSeconds) {
        if (null == key) {
            return false;
        }

        long maxTryLockNano = TimeUnit.SECONDS.toNanos(maxTryLockSeconds);
        long maxLifeCycleNano = TimeUnit.SECONDS.toNanos(maxLifeCycleSeconds);
        long firstEnterNano = System.nanoTime();// 第一次进入时候的纳秒数

        String threadName = Thread.currentThread().getName();
        int loop = 0;

        do {
            loop++;
            System.out.println("-------------------------------------" + threadName + "循环" + loop);

            long setnx = redisService.setnx(key, System.nanoTime() + "");
            if (1 == setnx) {
                System.out.println("-------------------------------------" + threadName + "获得锁");
                return true;// 设置成功获取锁
            }

            String existsTimeStr = redisService.get(key);
            if (null != existsTimeStr) {
                long oldTime = Long.parseLong(existsTimeStr);
                if (System.nanoTime() - oldTime > maxLifeCycleNano) {
                    // 判定为死锁，
                    // 删除锁，只能由一个线程来删
                    String unLockKey = key + "-unlock";
                    long count = redisService.incr(unLockKey);
                    if (1 == count) {
                        System.out.println("-------------------------------------" + threadName + "解锁");
                        // 获取权限，执行删除
                        redisService.pexpire(unLockKey, 300);// 解锁Key,300毫秒失效
                        unlock(key);
                        continue;
                    }
                }
            }

            try {
                Thread.sleep(300);// 睡300毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while ((System.nanoTime() - firstEnterNano) < maxTryLockNano);
        // 当前线程获取锁超时,判定请求锁失败
        return false;
    }

    public void unlock(String key) {
        redisService.del(key);
    }

}
