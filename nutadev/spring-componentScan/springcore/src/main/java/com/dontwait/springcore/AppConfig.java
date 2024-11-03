package com.dontwait.springcore;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//Là một anotation đánh dấu trên một class, cho biết rằng class đó chứa thông tin cấu hình cho ứng dụng
//Spring bootstrap sẽ tìm và quét các class được đánh dấu @Config để tạo và quản li' các beans
public class AppConfig {

    @Bean
    public Boy boy() {
        return new Boy();
    }
}
