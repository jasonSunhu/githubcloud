package com.sunhu.service.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceImplTest {
    private static Logger logger = LoggerFactory.getLogger(RedisServiceImplTest.class);

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

    //sentinel模式 故障转移测试
    @Test
    public void testRedisSentinel(){
        String masterName = "mymaster";
        Set<String> sentinels = new HashSet<>();
        sentinels.add("192.168.11.130:26379");
        sentinels.add("192.168.11.130:26380");
        sentinels.add("192.168.11.130:26381");
        JedisSentinelPool sentinelPool = new JedisSentinelPool(masterName,sentinels);
        int count = 0;
        while (true){
            count++;
            Jedis jedis = null;
            try {
                int index = new Random().nextInt(10000);
                String key = "k" + index;
                String value = "v" + index;
                jedis = sentinelPool.getResource();
                jedis.set(key, value);
                if (count%100 == 0) {
                    logger.info("{} value is {}", key, jedis.get(key));
                }
                TimeUnit.MICROSECONDS.sleep(10);
            }catch (Exception e){
                logger.error(e.getMessage(),e);
            }finally {
                if (jedis != null){
                    jedis.close();
                }
            }
        }
    }


}