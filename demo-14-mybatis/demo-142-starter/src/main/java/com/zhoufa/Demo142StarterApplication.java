package com.zhoufa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhoufangan
 */
@SpringBootApplication
@MapperScan(
        basePackages = {"com.zhoufa.mapper"}
)
public class Demo142StarterApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo142StarterApplication.class, args);
    }
}
