package com.sunhu.web.other;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/24.
 */
@Component
@PropertySource("classpath:jdbc.properties")
public class JdbcBean {
    @Value("${driver}")
    private String ip;

    @Value("${usernamed}")
    private String name;

    public void show(){
        System.out.println(ip);
        System.out.println(name);
    }
}
