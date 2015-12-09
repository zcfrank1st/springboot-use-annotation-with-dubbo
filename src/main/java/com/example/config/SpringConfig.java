package com.example.config;

import com.example.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zcfrank1st on 12/9/15.
 */
@Configuration
@ImportResource({"classpath:spring/dubbo-consumer.xml"})
public class SpringConfig {
    @Bean
    public User user() {
        User user =  new User();
        user.setAge("11");
        user.setUserName("haha");
        return user;
    }
}
