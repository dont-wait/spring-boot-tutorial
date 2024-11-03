package com.dontwait.springcore;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Boy boy() {
        return new Boy();
    }

    //o phien ban toi dang test thi khong can ham duoi objectmapper van dc quan li boi ioc container
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
