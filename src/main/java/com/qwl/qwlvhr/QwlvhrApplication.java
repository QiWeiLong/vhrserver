package com.qwl.qwlvhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qwl.qwlvhr.mapper")
@SpringBootApplication
public class QwlvhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(QwlvhrApplication.class, args);
    }

}
