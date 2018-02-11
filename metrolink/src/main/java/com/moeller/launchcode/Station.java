package com.moeller.launchcode;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Nick on 9/14/2017.
 */



@Component
@Entity
@Table(name = "stops")
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stop_id", unique = true, nullable = false)
    private Integer stopID;
    @Column(name = "stop_name")
    private String stopName;



    public Station() {

    }

    public void setStopName(String stopName){
        this.stopName = stopName;
    }



    public void setStopID(int stopID) {
        this.stopID = stopID;
    }

    public String getStopName() {
        return stopName;
    }



    public Integer getStopID(){
        return stopID;
    }
}