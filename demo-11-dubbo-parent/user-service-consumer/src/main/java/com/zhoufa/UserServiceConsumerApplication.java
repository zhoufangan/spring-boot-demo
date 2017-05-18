package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(
        scanBasePackages = {"com.zhoufa"},
        exclude = {
                MongoAutoConfiguration.class
        }
)
@EnableAutoConfiguration
@ServletComponentScan(basePackages = "com.zhoufa.controller")
@ImportResource(
        locations = {
                "classpath:dubbo-consumer-setting.xml",
                "classpath:dubbo-reference-api.xml"
        }
)
public class UserServiceConsumerApplication {

    public static void main(String[] args) {
        // SpringApplication.run(UserServiceConsumerApplication.class, args);

        SpringApplication app = new SpringApplication(UserServiceConsumerApplication.class);
        app.run(args);
        // 由于消费者端，集成里tomcat容器，所以不需要System.in.read()

    }
}
