import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Nick on 9/21/2017.
 */
@Component
public class Stops {
    private List<Station> RouteStops;

    public Stops() {
        RouteStops = new SqliteJDBCDao().getStopsAllStops();//SqliteJDBCDao.getInstance().getStopsAllStops();
    }

    public void outputStations() {//list stations
        for (int i = 0; i < RouteStops.size(); i++) {
            int y = i;
            System.out.print(y + " " + RouteStops.get(i).getStationName() + "  ");
            if (y % 3 == 0) {
                System.out.println();
            }
        }
    }

    public String getStationName(int user_input) {// retrieve station name using user input from stored list
        return RouteStops.get(user_input).getStationName();
    }

    public String getNextArrival(int user_input) {//retrieve next arrival time from user's station

       getStationName(user_input);

        List<String> arrivals = new SqliteJDBCDao().getArrivals();//SqliteJDBCDao.getInstance().getArrivals();
        String arrivalTime = arrivals.get(user_input);

        return arrivalTime;
        }
    }



