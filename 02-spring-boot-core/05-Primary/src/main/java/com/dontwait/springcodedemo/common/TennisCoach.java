package com.dontwait.springcodedemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //tui thich Giao vien Tennis, Cricket nhat nhung ma....
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice tennis for 10 minutes!";
    }
}
