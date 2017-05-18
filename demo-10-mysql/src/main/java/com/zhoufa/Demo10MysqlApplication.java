package com.zhoufa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
        scanBasePackages = {"com.zhoufa"},
        exclude = {
                MongoAutoConfiguration.class
        }
)
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
@EnableAutoConfiguration
@ServletComponentScan(basePackages = "com.zhoufa.controller")
@MapperScan(basePackages = "com.zhoufa.dao")
public class Demo10MysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo10MysqlApplication.class, args);
    }
}
