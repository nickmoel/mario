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
    public static int id;

    @Id
    @Column(name = "stop_name")
    public String stationName;


    //@Component
//public class Station {
//    public Station() {
//
//    }

    void setName(String name) {
        this.stationName = name;
    }

    void setID(int id) {
        this.id = id;
    }

    String getStationName() {
        return stationName;
    }

    public static int getID() {
        return id;
    }


}