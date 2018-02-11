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
    //public List <Arrival> stopTimes;
    @Autowired
    private SqliteJDBCDao arrival;//*
    private String arrivalTime;


    public void Stops() {

    }

    public List<Station> outputStations() {//list stations

        List<Station> routeStops = arrival.getStopsAllStops();

        for (Station station : routeStops) {
            System.out.println(station.getStopID() + " " + station.getStopName());
        }
        return routeStops;
//        for (int i = 0; i < routeStops.size(); i++) {
//            int y = i;
//            System.out.print(y + " " + routeStops.get(i).getStopName() + "  ");
//            if (y % 3 == 0) {
//                System.out.println();
//            }
//        }
    }

//    public void setID(int user_Input) {// retrieve station id using user input from stored list
//       // List<Station> routeStops = arrival.getStopsAllStops();
//        List<Station> routeStops = arrival.getStopsAllStops();
//        routeStops.get(user_Input).setID(user_Input);
//
//    }

    public Station getStationName(int user_Input) {// retrieve station name using user input from stored list
       // List<Station> routeStops = outputStations();
                //arrival.getStopsAllStops();
        //List<Stop> stops = getMetroLinkStations();
       // appOutput.print("Enter the ID of your current station:");

        for(Station station : routeStops) {
            if(station.getStopID()==user_Input) {
                return station;
            }
        }
        return null;
    }


    public String getNextArrival(int user_Input) {

        Station stop = getStationName(user_Input);
        String arrivalTime = arrival.getArrivals(stop);
        //appOutput.print("The next train will arrive at " + formatStationTime(arrivalTime.getArrivalTime()));
//        arrivalTime.toString();
        return convertTime(arrivalTime);
    }

        public String convertTime(String arrivalTime) {

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