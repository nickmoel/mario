import org.springframework.stereotype.Component;

/**
 * Created by Nick on 9/14/2017.
 */
@Component
public class Station {
    private String stationName;
    private static String id;

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