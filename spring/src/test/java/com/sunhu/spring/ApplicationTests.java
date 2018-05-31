package com.sunhu.spring;


import com.sunhu.web.other.UserDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	ApplicationContext applicationContext;
	@Autowired
	Environment environment;//获取配置文件的内容

	@Test
	public void contextLoads() {
	}
	@Test
	public void testNull(){
		Assert.assertNotNull(applicationContext.getBean(UserDAO.class));
	}
	//测试配置文件的内容
	@Test
	public void testValue(){
		Assert.assertEquals("sunhu",environment.getProperty("name"));
	}
}
