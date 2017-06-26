package com.zhoufa.configuration;

import redis.clients.jedis.ShardedJedisPool;

/**
 * @author Created by zhoufangan on 2017/6/22.
 */
public interface IRedisConfiguration {

    ShardedJedisPool shardedJedisPool();
}
