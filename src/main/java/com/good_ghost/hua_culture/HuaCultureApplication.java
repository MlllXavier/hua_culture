package com.good_ghost.hua_culture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.good_ghost.hua_culture.mapper")
public class HuaCultureApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaCultureApplication.class, args);
    }

}
