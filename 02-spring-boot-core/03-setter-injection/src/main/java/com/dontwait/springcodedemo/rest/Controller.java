package com.dontwait.springcodedemo.rest;

import com.dontwait.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //define a private field
    private Coach myCoach;

    @Autowired
    public void setCoach(Coach coachParam) {
        myCoach = coachParam;
    }
//    //constructor injection
//    public Controller(Coach coach) {
//        myCoach = coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
