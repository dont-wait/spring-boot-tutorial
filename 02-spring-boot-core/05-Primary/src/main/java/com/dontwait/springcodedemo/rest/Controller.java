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
    //giao vien bong ro lai la nguoi khien toi co gang nhat

    public Controller(@Qualifier("baseballCoach") Coach coach) {
        myCoach = coach;
    }
//    public Controller(Coach coach) {
//        myCoach = coach;
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
