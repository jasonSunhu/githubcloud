package com.sunhu.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/24.
 */
@Component
public class MyBean {
    @Value("${local.ip}")
    private String ip;

    @Value("${this.name}")
    private String name;


    public void show(){
        System.out.println(ip);
        System.out.println(name);
    }
}
