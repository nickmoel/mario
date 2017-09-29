import org.springframework.stereotype.Component;

/**
 * Created by Nick on 9/19/2017.
 */
@Component
public class Validation {

   // private Stops metroStops;
    //public Validation(Stops metroStops) {
       // this.metroStops = metroStops;

    //}

    public boolean validation(int user_input) {
        Stops metroStops = new Stops();

        metroStops.outputStations();

        if (user_input>= 0 && user_input < 36) {
            System.out.println("The next arrival at " + metroStops.getStationName(user_input) + " is " + metroStops.getNextArrival(user_input));
            return true;
        } else {
            System.out.println("Invalid input. ");
            System.out.println("Please make your METROLINK Station selection from 0-35.");
            return false;
        }
    }

}
