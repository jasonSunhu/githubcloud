package com.sunhu.web.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/5/28.
 */
@RunWith(SpringRunner.class)
//会加载整个spring容器，controller中的依赖会加载
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)//内嵌服务器，随机端口
public class BookControllerTest {
    //需要运行在web环境
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void bookHome() throws Exception {
        String context = testRestTemplate.getForObject("/book/home", String.class);
        Assert.assertEquals("bookhome",context);
    }
    @Test
    public void bookshow(){
        String context = testRestTemplate.getForObject("/book/show?id=1", String.class);
        Assert.assertEquals("bookshow1",context);
    }

}