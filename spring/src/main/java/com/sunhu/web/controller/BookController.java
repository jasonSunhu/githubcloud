package com.sunhu.web.controller;

import com.sunhu.web.other.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/28.
 */
@RestController
public class BookController {

    @Autowired
    private UserDAO userDAO;
    @GetMapping("/book/home")
    public String bookHome(){
        System.out.println("/book/home url is invoke");
        userDAO.addUser("hhh");
        return "bookhome";
    }
    @GetMapping("/book/show")
    public String bookshow(@RequestParam String id){
        System.out.println("/book/show url is invoke");
        return "bookshow"+id;
    }
}
