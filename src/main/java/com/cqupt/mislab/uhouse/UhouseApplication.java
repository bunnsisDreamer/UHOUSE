package com.cqupt.mislab.uhouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cqupt.mislab.uhouse.dao")
@SpringBootApplication
public class UhouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(UhouseApplication.class, args);
    }

}
