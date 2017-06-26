package com.zhoufa.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhoufangan on 2017/4/18.
 */
@Component
public class RedisLock {

    @Autowired
    private RedisService redisService;

    /**
     * 互斥锁
     * 优点：计数器准确
     * 缺点：别的线程无法解锁，只能等待当前线程执行完毕解锁，或者key失效
     *
     * @param key          key
     * @param expireSecond 锁的最大生命周期单位：秒
     * @return 成功true，失败false
     */
    public boolean mutexLockEnhance(String key, int expireSecond) {
        if (null == key) {
            return false;
        }
        if (0 == expireSecond) {
            return false;
        }

        long count = redisService.incr(key);
        if (1 == count) {
            // 设置成功获取锁
            redisService.expire(key, expireSecond);
            return true;
        }
        return false;
    }

    /**
     * 互斥锁
     *
     * 优点：其他线程可以解锁
     * 缺点：同一个毫秒内访问就无法区分出是否被锁定了
     *
     * @param key          key
     * @param maxLifeCycle 锁的最大生命周期 单位：毫秒
     * @return 成功true，失败false
     */
    public boolean mutexLock(String key, long maxLifeCycle) {
        if (null == key) {
            return false;
        }
        long setnx = redisService.setnx(key, System.currentTimeMillis() + "");
        if (1 == setnx) {
            // 设置成功获取锁
            return true;
        }
        long oldTime = Long.parseLong(redisService.get(key));
        if (System.currentTimeMillis() - oldTime < maxLifeCycle) {
            // 锁还未死亡
            return false;
        }

        // 判定为死锁，重新设置锁
        long currentTime = Long.parseLong(redisService.getSet(key, System.currentTimeMillis() + ""));
        if (oldTime == currentTime) {
            // 这段时间没有其他线程修改，当前线程获取锁
            return true;
        } else {
            // 锁已经被其他线程获取
            return false;
        }
    }

    public void unlock(String key) {
        redisService.del(key);
    }

}
