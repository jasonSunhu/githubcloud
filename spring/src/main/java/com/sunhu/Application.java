package com.sunhu;

import com.sunhu.web.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@Import({Role.class, User.class})
public class Application {
	@Bean
	public Runnable createRunnable(){
		return ()->{System.out.println("spring boot is running");};
	}
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.setAdditionalProfiles("test");

		ConfigurableApplicationContext context =  application.run(args);
		context.getBean(Runnable.class).run();
		//异步
		context.getBean(TestEnable.class).show();
		System.out.println(context.getBean(MyBean.class));
		context.getBean(MyBean.class).show();
		System.out.println(context.getEnvironment().getProperty("local.ip"));
		context.getBean(JdbcBean.class).show();
		//import装配配bean
		System.out.println(context.getBean(User.class));
		System.out.println(context.getBean(Role.class));
	}
}
