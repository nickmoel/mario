import java.time.LocalTime;
import java.util.List;

/**
 * Created by Nick on 9/21/2017.
 */
public class Stops {
    private List<Station> RouteStops;


    public Stops(){
        RouteStops = SqliteJDBCDao.getInstance().getStopsAllStops();
    }

    public void outputStations() {//list stations
        for (int i = 1; i < RouteStops.size(); i++) {
            int y = i ;
            System.out.print(y + " " + RouteStops.get(i).getStationName() + "  ");
            if (y % 3 == 0) {
                System.out.println();
            }
        }
    }

    public Station getStation (int user_input){
        return RouteStops.get(user_input);
    }
    public String getStationName(int user_input){
        return RouteStops.get(user_input).getStationName();
    }

    public String getNextArrival(int user_input){
        getStation(user_input);

       List<String> arrivals = SqliteJDBCDao.getInstance().getArrivals();
        int i = 0;
        String arrivalTime = arrivals.get(i);
        while(LocalTime.parse(arrivalTime).isBefore(LocalTime.now())){
            arrivalTime = arrivals.get(i);
            i++;
        }
        return arrivalTime;
    }
}