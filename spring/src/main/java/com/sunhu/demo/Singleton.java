package com.sunhu.demo;

/**
 * Created by Administrator on 2018/8/2.
 */
public class Singleton {
    private Singleton(){};
    private static Singleton singleton = null;
    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
