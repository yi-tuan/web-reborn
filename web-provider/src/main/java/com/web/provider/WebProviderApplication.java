package com.web.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.web.provider.")
public class WebProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebProviderApplication.class, args);
    }

}
