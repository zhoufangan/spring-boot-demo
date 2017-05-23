package com.zhoufa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhoufangan mybatis criteria
 */
@SpringBootApplication
@MapperScan(
        basePackages = {
                "com.zhoufa.autogeneration.mapper",
                "com.zhoufa.custom.mapper"
        }
)
public class Demo146CriteriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo146CriteriaApplication.class, args);
    }
}
