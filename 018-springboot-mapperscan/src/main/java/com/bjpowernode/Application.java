package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan: 找到Dao接口和Mapper文件
 *     basePackages：Dao接口所在的包名
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.bjpowernode.dao","com.bjpowernode.mapper"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
