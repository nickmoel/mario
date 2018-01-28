package com.moeller.launchcode;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Nick on 9/14/2017.
 */

//@Entity
//@Table(name="stops")
//public class Stops {
//    @Id
//    @GeneratedValue(strategy=IDENTITY)
//    @Column(name="stop_id",unique = true, nullable = false)
//    private Integer stopID;
//    @Column(name = "stop_name")
//    private String stopName;
//    @Column(name = "stop_desc")
//    private String stopDescription;
//
//
//    public Stop() {
//
//    }
//
//    public void setStopName(String stopName){
//        this.stopName = stopName;
//    }
//
//    public void setStopDescription(String stopDescription) {
//        this.stopDescription = stopDescription;
//    }
//
//    public void setStopID(int stopID) {
//        this.stopID = stopID;
//    }
//
//    public String getStopName() {
//        return stopName;
//    }
//
//    public String getStopDescription() {
//        return stopDescription;
//    }
//
//    public Integer getStopID(){
//        return stopID;
//    }
//}


@Component
@Entity
@Table(name = "stops")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stop_id", unique = true, nullable = false)
    public static Integer id;
    @Id

    @Column(name = "stop_name", unique = true, nullable = false)
    public String Name;

    public Station() {}

//    public Station(String t)
//    {
//        time = t;
//    }
//
//    public Station (String t, int id)
//    {
//        time    = t;
//        stop_id = id;
//    }
    //@Component
//public class Station {


//   public Station() {
//
//    }

//    void setName(String name) {
//        this.Name = name;
//    }
//
    void setID(Integer id) {
        this.id = id;
    }

    String getStationName() {
        return Name;
    }

    static Integer getID() {
        return id;
    }

//    public String getTime()
//    {
//        return time;
//    }


}