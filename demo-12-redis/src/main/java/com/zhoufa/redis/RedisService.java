package com.zhoufa.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * @author zhoufangan on 2017/4/18.
 */
@Component
public class RedisService {

    @SuppressWarnings("all")
    @Autowired
    private ShardedJedisPool shardedJedisPool;

    private ShardedJedis getJedis() {
        return shardedJedisPool.getResource();
    }

    public void set(String key, String value) {
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            jedis.set(key, value);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    public void set(String key, String value, int seconds) {
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            jedis.set(key, value);
            jedis.expire(key, seconds);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    /**
     * 将 key 的值设为 value ，当且仅当 key 不存在。若给定的 key 已经存在，则 SETNX 不做任何动作。
     *
     * @param key   key
     * @param value value
     * @return 设置成功，返回 1 ；设置失败，返回 0
     */
    public Long setnx(String key, String value) {
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            return jedis.setnx(key, value);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    public String get(String key) {
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            return jedis.get(key);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    /**
     * 删除
     *
     * @param key key
     * @return 被删除 key 的数量
     */
    public Long del(String key) {
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            return jedis.del(key);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    /**
     * 设置失效时间：单位秒
     *
     * @param key     键
     * @param seconds 失效时间
     */
    public void expire(String key, int seconds) {
        if (seconds <= 0) {
            return;
        }
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            jedis.expire(key, seconds);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    /**
     * 失效毫秒数
     *
     * @param key          键
     * @param milliseconds 失效时间
     */
    public void pexpire(String key, long milliseconds) {
        if (milliseconds <= 0) {
            return;
        }
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            jedis.pexpire(key, milliseconds);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    /**
     * 将给定 key 的值设为 value ，并返回 key 的旧值(old value)。
     *
     * @param key   key
     * @param value value
     * @return 返回旧值
     */
    public String getSet(String key, String value) {
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            return jedis.getSet(key, value);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }

    /**
     * redis计数器，讲key 中储存的数字值增一，如果 key 不存在，那么 key 的值会先被初始化为 0 ，然后再执行 INCR 操作
     *
     * @param key key
     * @return 数字
     */
    public Long incr(String key) {
        ShardedJedis jedis = null;
        try {
            jedis = getJedis();
            return jedis.incr(key);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
    }
}
