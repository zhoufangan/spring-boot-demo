package com.zhoufa;

import com.zhoufa.redis.RedisBillLock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo12RedisApplicationTests {

    @Autowired
    private RedisBillLock redisBillLock;

    @Test
    public void contextLoads() {
        final long maxTryLockSeconds = 60;
        final int maxLifeCycleSeconds = 10;
        final String key = "aaaaaa";

        Thread t1 = new Thread(() -> {
            boolean success = redisBillLock.tryReadWriteLock(key, maxTryLockSeconds, maxLifeCycleSeconds);
            System.out.println("thread-1执行完毕 --- " + success + " --- [" + System.currentTimeMillis() + "]");
        });
        Thread t2 = new Thread(() -> {
            boolean success = redisBillLock.tryReadWriteLock(key, maxTryLockSeconds, maxLifeCycleSeconds);
            System.out.println("thread-2执行完毕 --- " + success + " --- [" + System.currentTimeMillis() + "]");
        });
        Thread t3 = new Thread(() -> {
            boolean success = redisBillLock.tryReadWriteLock(key, maxTryLockSeconds, maxLifeCycleSeconds);
            System.out.println("thread-3执行完毕 --- " + success + " --- [" + System.currentTimeMillis() + "]");
        });
        Thread t4 = new Thread(() -> {
            boolean success = redisBillLock.tryReadWriteLock(key, maxTryLockSeconds, maxLifeCycleSeconds);
            System.out.println("thread-4执行完毕 --- " + success + " --- [" + System.currentTimeMillis() + "]");
        });
        Thread t5 = new Thread(() -> {
            boolean success = redisBillLock.tryReadWriteLock(key, maxTryLockSeconds, maxLifeCycleSeconds);
            System.out.println("thread-5执行完毕 --- " + success + " --- [" + System.currentTimeMillis() + "]");
        });
        Thread t6 = new Thread(() -> {
            boolean success = redisBillLock.tryReadWriteLock(key, maxTryLockSeconds, maxLifeCycleSeconds);
            System.out.println("thread-6执行完毕 --- " + success + " --- [" + System.currentTimeMillis() + "]");
        });

        t1.setName("thead-1");
        t2.setName("thead-2");
        t3.setName("thead-3");
        t4.setName("thead-4");
        t5.setName("thead-5");
        t6.setName("thead-6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();


        try {
            Thread.sleep(2 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
