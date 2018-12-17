package com.itjun;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.itjun.mapper")
public class MainApp {
    public static void main(String [] args){
        SpringApplication.run(MainApp.class,args);
    }
}
