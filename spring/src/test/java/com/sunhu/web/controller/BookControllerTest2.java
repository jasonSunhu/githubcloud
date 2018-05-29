package com.sunhu.web.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/5/28.
 */
@RunWith(SpringRunner.class)
//不需要指定内嵌的web环境，但需要指定controller
//不会加载整个spring容器，controller中的依赖不会加载
@WebMvcTest(controllers = BookController.class)
public class BookControllerTest2 {

    @Autowired
    private MockMvc mvc;

    @Test
    public void bookHome() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk());
        mvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("bookhome"));
    }

    @Test
    public void bookshow() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/book/show").param("id", "400")).andExpect(MockMvcResultMatchers.status().isOk());
    }

}