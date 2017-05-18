package com.zhoufa;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

// 关闭特定的自动配置 用exclude
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// 自动扫描controller包
@ServletComponentScan(basePackages = "com.zhoufa.controller")
public class Demo03AutoConfigurationApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Demo03AutoConfigurationApplication.class, args);

		SpringApplication app = new SpringApplication(Demo03AutoConfigurationApplication.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}

}
