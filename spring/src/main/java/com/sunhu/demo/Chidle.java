package com.sunhu.demo;

/**
 * Created by Administrator on 2018/8/21.
 */
public class Chidle extends Person {
    public String grade;
    public static void main(String[] args){
        Person p = new Chidle();
        //System.out.println(p.name);p.name编译报错，子类无法访问父类私有属性
    }
}
