package com.zhoufa;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo01HelloWorldApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Demo01HelloWorldApplication.class, args);

		SpringApplication app = new SpringApplication(Demo01HelloWorldApplication.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}

	@RequestMapping("/index")
	public String index() {
		return "welcome to spring-boot! hello world!";
	}
}
