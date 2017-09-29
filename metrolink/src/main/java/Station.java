import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Nick on 9/14/2017.
 */
@Component
public class Station {
    private String stationName;
    private static String id;
    public List<String> PassengerStation;

    public Station () { PassengerStation = SqliteJDBCDao.getInstance().getArrivals();}

    void setName(String name) {
        this.stationName = name;
    }

    void setID(String id) {
        this.id = id;
    }

    String getStationName() {
        return stationName;
    }

    static String getID() {
        return id;
    }


}