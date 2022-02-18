package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//获取容器对象
		//ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		//从容器中获取对象
		UserService userService = (UserService)ctx.getBean("userService");
		userService.sayHello("李四");

	}

}
