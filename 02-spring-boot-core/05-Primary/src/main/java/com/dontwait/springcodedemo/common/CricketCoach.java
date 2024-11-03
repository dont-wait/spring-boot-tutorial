package com.dontwait.springcodedemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 15 minutes!!!!";
    }
}
