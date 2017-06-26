package com.zhoufa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by zhoufangan on 2017/6/22.
 */
@Configuration
public class RedisConfiguration implements IRedisConfiguration {

    @Override
    @Bean
    @Order(100)
    public ShardedJedisPool shardedJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(1000 * 60);//对象最大空闲时间
        config.setMaxWaitMillis(1000 * 10);//获取对象时最大等待时间
        config.setTestOnBorrow(true);
        String hostA = "192.168.110.140";
        int portA = 6379;

        List<JedisShardInfo> jdsInfoList = new ArrayList<>(1);
        JedisShardInfo infoA = new JedisShardInfo(hostA, portA);
        infoA.setPassword("123456");
        jdsInfoList.add(infoA);
        return new ShardedJedisPool(config, jdsInfoList);
    }
}
