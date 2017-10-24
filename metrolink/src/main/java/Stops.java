import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Nick on 9/21/2017.
 */
@Component

public class Stops {
    private List<Station> routeStops;

    public Stops() {
        routeStops = new SqliteJDBCDao().getStopsAllStops();//SqliteJDBCDao.getInstance().getStopsAllStops();
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

    public String getNextArrival(int user_input) {//retrieve next arrival time from user's station

       getStationName(user_input);

        List<String> arrivals = new SqliteJDBCDao().getArrivals();//SqliteJDBCDao.getInstance().getArrivals();
        String arrivalTime = arrivals.get(user_input);

        return arrivalTime;
        }
    }



