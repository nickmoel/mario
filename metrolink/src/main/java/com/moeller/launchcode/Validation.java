package com.moeller.launchcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nick on 9/19/2017.
 */
@Component
class Validation {

    @Autowired
    Stops metroStops;

    //public void setMetroStops(com.moeller.launchcode.Stops metroStops) {
    //this.metroStops = metroStops;
    //}


    public Validation() {

    }

    boolean isValid(int userInput) {
        return userInput >= 0 && userInput < 36;
    }

    String getNextStationArrival(int user_Input) {
        return "The next arrival at " + metroStops.getStationName(user_Input) + " is at " + metroStops.getNextArrival(user_Input);
    }

    void validate(int user_Input) {
        if (isValid(user_Input)) {
            System.out.println(getNextStationArrival(user_Input));
        } else {
            //return user_Input;
            System.out.println("Invalid input. ");
            System.out.println("Please make your METROLINK Station selection from 0-35.");
            // return user_Input;
        }

    }
}