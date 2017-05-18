package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan(basePackages = "com.zhoufa.controller")
public class Demo07ViewResolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo07ViewResolverApplication.class, args);
	}
}
