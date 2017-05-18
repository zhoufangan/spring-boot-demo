package com.zhoufa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

@SpringBootApplication(
        scanBasePackages = {"com.zhoufa"},
        exclude = {
                MongoAutoConfiguration.class
        }
)
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
@EnableAutoConfiguration
@MapperScan(basePackages = "com.zhoufa.dao")
@ImportResource(
        locations = {
                "classpath:dubbo-provider-setting.xml",
                "classpath:dubbo-service-api.xml"
        }
)
public class UserServiceProviderApplication {

    public static void main(String[] args) {
        // SpringApplication.run(UserServiceProviderApplication.class, args);

        SpringApplication application = new SpringApplication(UserServiceProviderApplication.class);
        // JDK优雅关机 kill PID，kill -9 PID 是强制关机
        application.setRegisterShutdownHook(true);
        application.run(args);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
