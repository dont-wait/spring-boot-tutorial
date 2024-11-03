package com.dontwait.springcodedemo.rest;

import com.dontwait.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //define a private field
    private final Coach myCoach;

    //contructor injection
    @Autowired
    public Controller(@Qualifier("tennisCoach") Coach coach) {
        myCoach = coach;
    }

//    @Autowired
//    public void setCoach(Coach coachParam) {
//        myCoach = coachParam;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
