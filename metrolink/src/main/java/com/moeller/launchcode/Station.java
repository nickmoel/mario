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
    public Integer id;

    @Column(name = "stop_name", unique = true, nullable = false)
    public String Name;

    public Station() {
    }

    void setID(Integer id) {
        this.id = id;
    }

    String getStationName() {
        return Name;
    }

    Integer getId() {
        return id;
    }


}