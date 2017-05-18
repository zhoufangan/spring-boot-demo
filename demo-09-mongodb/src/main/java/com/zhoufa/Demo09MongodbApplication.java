package com.zhoufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(
        scanBasePackages = {
                "com.zhoufa"
        },
        exclude = {
                MongoAutoConfiguration.class
        }
)
@ServletComponentScan(basePackages = "com.zhoufa.controller")
public class Demo09MongodbApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo09MongodbApplication.class);
        app.run(args);
    }
}
