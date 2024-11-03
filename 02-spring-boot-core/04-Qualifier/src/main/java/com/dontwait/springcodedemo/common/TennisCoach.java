package com.dontwait.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice tennis for 10 minutes!";
    }
}
