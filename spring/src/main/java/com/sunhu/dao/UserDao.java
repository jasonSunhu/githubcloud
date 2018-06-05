package com.sunhu.dao;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/5.
 */
@Component
public class UserDao {

    public void add(String username,String password){
        System.out.println("useranme："+username+"password："+password);
    }
}
