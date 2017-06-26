package com.zhoufa.redis;

/**
 * @author zhoufangan on 2017/4/18.
 */
public final class RedisKeyGenerator {

    /**
     * Redis key 生成
     *
     * @param key  RedisKeys里常量
     * @param args key参数
     * @return 生成的key
     */
    public static String generator(String key, Object... args) {
        return String.format(key, args);
    }

}
