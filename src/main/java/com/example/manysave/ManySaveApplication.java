package com.example.manysave;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.manysave.mapper")
@SpringBootApplication
public class ManySaveApplication {

    public static void main (String[] args) {
        SpringApplication.run(ManySaveApplication.class, args);
    }

}
