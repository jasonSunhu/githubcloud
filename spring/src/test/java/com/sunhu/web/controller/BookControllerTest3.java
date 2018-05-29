package com.sunhu.web.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by Administrator on 2018/5/28.
 */
//@SpringBootTest不能和@WebMvcTest同时使用
//    需要和@AutoConfigureMockMvc配合
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest3 {

    @Autowired
    private MockMvc mvc;
    @Test
    public void bookHome() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
        mvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("bookhome"));
    }

    @Test
    public void bookshow() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/book/show").param("id", "400")).andExpect(MockMvcResultMatchers.status().isOk());
    }

}