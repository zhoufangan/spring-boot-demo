package com.zhoufa;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan(basePackages = "com.zhoufa.controller")
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

}
