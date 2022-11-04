package com.liuwei.liuwei_reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class LiuweiReggieApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuweiReggieApplication.class, args);
        log.info("项目启动成功....");
    }

}
