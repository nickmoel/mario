package com.moeller.launchcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Nick on 9/21/2017.
 */
@Controller
public class Stops {
    @Autowired
    private List<Station> routeStops;
    @Autowired
    private SqliteJDBCDao arrival;

//    public Stops (SqliteJDBCDao arrival) {
//        this.arrival = arrival;
//    }


//    public Stops() {
//
//    }


//    //@PostConstruct
//    public void Stops(List routeStops) {
//        this.routeStops = new SqliteJDBCDao().getStopsAllStops();
//    }

   @Transactional
    public void Stops() {
       routeStops = new SqliteJDBCDao().getStopsAllStops();
    }

    public void outputStations() {//list stations
        for (int i = 0; i < routeStops.size(); i++) {
            int y = i;
            System.out.print(y + " " + routeStops.get(i).getStationName() + "  ");
            if (y % 3 == 0) {
                System.out.println();
            }
        }
    }

    public String getStationName(int user_Input) {// retrieve station name using user input from stored list
        return routeStops.get(user_Input).getStationName();
    }

    public String getNextArrival(int user_input) {

        getStationName(user_input);

        List<String> arrivals = arrival.getArrivals();
        String arrivalTime = arrivals.get(user_input);
        return convertTime(arrivalTime);
    }
    public String convertTime(String arrivalTime){

        //input time pattern
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        //Date/time pattern of desired output date
        DateFormat outputformat = new SimpleDateFormat("hh:mm:ss aa");
        Date date;
        String output;
        try{
            //Conversion of input String to date
            date= df.parse(arrivalTime);
            //old date format to new date format
            output = outputformat.format(date);
            //convert output back to arrivalTime
            arrivalTime = output;

        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return arrivalTime;
    }

}
