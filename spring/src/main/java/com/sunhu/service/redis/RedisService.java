package com.sunhu.service.redis;

/**
 * Created by Administrator on 2018/8/3.
 */
public interface RedisService {
    boolean set(String key, Object value);

    public String addKey(String id);
}
