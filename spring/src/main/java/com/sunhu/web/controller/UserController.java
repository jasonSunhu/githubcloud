package com.sunhu.web.controller;

import com.sunhu.web.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @GetMapping
 * @PostMapping
 * spring4.3新特性
 */
@Controller
public class UserController {
    /************************************************************************
     *@Description: http://localhost:8081/sunhu/user/home?username=sunhu&age=18
     *              username=sunhu,age:18
     *@Author:孙虎
     *@Date:2018/5/31
     ************************************************************************/
    @RequestMapping(value = "/user/home",method = RequestMethod.GET)
    public String userHome(@ModelAttribute UserVo userVo){
        //return "username="+userVo.getUsername()+",age:"+userVo.getAge();
        return "/userHome";
    }
}
