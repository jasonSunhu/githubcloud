package com.sunhu.service.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceImplTest {
    @Autowired RedisService redisService;
    @Test
    public void set() throws Exception {
        redisService.set("sunhu", "123");
        /*Jedis jedis = new Jedis("192.168.11.130",6379);
        jedis.auth("123456");
        jedis.set("sunhu", "123");
        String s = jedis.get("sunhu");
        System.out.println(s);
        jedis.close();*/
    }

    @Test
    public void addKey() throws Exception {
    }

}