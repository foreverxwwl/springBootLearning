package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @outhor li
 * @create 2020-02-26 8:00
 * springBoot引导类
 */
//说明该类是一个SpringBoot引导类
@SpringBootApplication
public class MySpringBootApplication {
    //程序入口
    public static void main(String[] args) {
        //运行springBoot的引导类  是该类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }
}
