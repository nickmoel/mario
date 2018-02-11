package com.moeller.launchcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by Nick on 9/21/2017.
 */


@Component
public class Stops {

    @Autowired
    public List<Station> routeStops;
    List<Station> routeStops1;
    @Autowired
    private SqliteJDBCDao arrival;
    private String arrivalTime;


    public void Stops() {

    }

    public void outputStations() {//list stations
        List<Station> routeStops = arrival.getStopsAllStops();
        for (int i = 0; i < routeStops.size(); i++) {
            int y = i;
            System.out.print(y + " " + routeStops.get(i).getStationName() + "  ");
            if (y % 3 == 0) {
                System.out.println();
            }
        }
    }

    public String getStationName(int user_Input) {// retrieve station name using user input from stored list
        List<Station> routeStops = arrival.getStopsAllStops();

        return routeStops.get(user_Input).getStationName();

    }

    public String getNextArrival(int user_input) {
        List<Station> routeStops = arrival.getStopsAllStops();
        Station station = routeStops.get(user_input);
        List<String> times = arrival.getArrivals(station);
        String arrivalTime = times.get(0);

        return convertTime(arrivalTime);
    }


    public String convertTime(String arrivalTime) {
        //input time pattern
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        //Date/time pattern of desired output date
        DateFormat outputformat = new SimpleDateFormat("hh:mm:ss aa");
        Date date;
        String output;
        try {
            //Conversion of input String to date
            date = df.parse(arrivalTime);
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
