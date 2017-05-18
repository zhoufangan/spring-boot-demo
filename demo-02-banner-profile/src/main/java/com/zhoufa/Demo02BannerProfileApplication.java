package com.zhoufa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo02BannerProfileApplication {

    @Value("${spring.profiles.active}")
    private String currentProfiles;

    public static void main(String[] args) {
        // SpringApplication.run(Demo02BannerProfileApplication.class, args);

        for (String arg : args) {
            System.out.println(arg);
        }

        SpringApplication app = new SpringApplication(Demo02BannerProfileApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

    // http://127.0.0.1:8080/win/index
    @RequestMapping("/index")
    public String index() {
        return "currentProfiles=[" + currentProfiles + "]";
    }
}
