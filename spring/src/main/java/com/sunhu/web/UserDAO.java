package com.sunhu.web;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/5/27.
 */
@Repository
public class UserDAO {
    public Integer addUser(String username){
        System.out.println("add user username="+username);
        if (username ==null){
            return 0;
        }else {
            return 1;
        }
    }
}
