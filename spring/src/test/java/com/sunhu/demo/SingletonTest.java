package com.sunhu.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/2.
 */
public class SingletonTest {
    @Test
    public void getSingleton() throws Exception {
        Singleton singleton = Singleton.getSingleton();
        Singleton s = Singleton.getSingleton();
        System.out.println(s==singleton);
    }

}