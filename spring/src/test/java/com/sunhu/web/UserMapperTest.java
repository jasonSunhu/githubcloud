package com.sunhu.web;

import com.sunhu.web.other.UserMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/5/28.
 */
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @MockBean
    private UserMapper userMapper;
    @Before
    public void init(){
        BDDMockito.given(userMapper.createUser("admin")).willReturn(Integer.valueOf(1));
        BDDMockito.given(userMapper.createUser("")).willReturn(Integer.valueOf(0));
        BDDMockito.given(userMapper.createUser(null)).willThrow(NullPointerException.class);
    }
    @Test(expected = NullPointerException.class)
    public void createUser() throws Exception {
        Assert.assertEquals(Integer.valueOf("1"),userMapper.createUser("admin"));
        Assert.assertEquals(Integer.valueOf("0"),userMapper.createUser(""));
        Assert.assertEquals(NullPointerException.class,userMapper.createUser(null));
    }

}