package com.zhoufa;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.jedis.Pipeline;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication(
        scanBasePackages = {
                "com.zhoufa"
        },
        exclude = {
                MongoAutoConfiguration.class,
                RedisAutoConfiguration.class
        }
)
@EnableAutoConfiguration
public class Demo12RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo12RedisApplication.class, args);
    }

    public void lock() {
        Jedis jedis = getJedis();

        String key = "order:lock:s%";
        Long status = jedis.setnx(key, System.currentTimeMillis() + "");
        if (1 == status) {
            // 原来没有锁，获得锁
            // 添加订单
            jedis.del(key);
            return;
        }

        if (0 == status) {
            // 没有获取锁
            String oldTimeStr = jedis.get(key);
            if ("nil".equals(oldTimeStr)) {
                // 正常枷锁,并处理订单
                jedis.del(key);
                return;
            }
            Long oldTime = Long.parseLong(oldTimeStr);
            if (System.currentTimeMillis() - oldTime > (10 * 60 * 1000)) {
                // 大于10分钟，超时
                String oldTimeStr2 = jedis.getSet(key, System.currentTimeMillis() + "");
                Long oldTime2 = Long.parseLong(oldTimeStr2);
                if (oldTime.longValue() == oldTime2.longValue()) {
                    // 这是第一个访问进来的，并替换oldTime了，获取锁
                    // 添加订单
                    jedis.del(key);
                    return;
                } else {
                    // 没有获取锁
                    return;
                }

            } else {
                // 没有大于10分钟，别人锁没超时，直接返回
                return;
            }
        }
    }

    public void testRedis() {
        String masterName = "";
        Set<String> sentinels = new HashSet<>();
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        int timeout = 0;
        String password = "";

        JedisSentinelPool pool = new JedisSentinelPool(masterName, sentinels, poolConfig, timeout, password);

        Jedis jedis = pool.getResource();

        Pipeline pipeline = jedis.pipelined();
        pipeline.set("name", "周方安");
        pipeline.sync();
    }

    private Jedis getJedis() {
        String masterName = "";
        Set<String> sentinels = new HashSet<>();
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        int timeout = 0;
        String password = "";
        JedisSentinelPool pool = new JedisSentinelPool(masterName, sentinels, poolConfig, timeout, password);
        Jedis jedis = pool.getResource();
        return jedis;
    }

}
