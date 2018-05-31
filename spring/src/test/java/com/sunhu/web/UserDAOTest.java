package com.sunhu.web;

import com.sunhu.web.other.UserDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/5/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {
    @Autowired
    private UserDAO userDAO;
    @Test
    public void addUser() throws Exception {
        Assert.assertEquals(Integer.valueOf("1"),userDAO.addUser("root"));
        Assert.assertEquals(Integer.valueOf("0"),userDAO.addUser(null));
    }

}