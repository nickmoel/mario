import org.springframework.stereotype.Component;

/**
 * Created by Nick on 9/19/2017.
 */
@Component
public class Validation {


    public Validation() {

    }

    public static int getValidation(int user_input) {

        Stops metroStops = new Stops();

        if (user_input>= 0 && user_input < 36) {
            System.out.println("The next arrival at " + metroStops.getStationName(user_input) + " is at " + metroStops.getNextArrival(user_input));
            return user_input;
        } else {
            System.out.println("Invalid input. ");
            System.out.println("Please make your METROLINK Station selection from 0-35.");
            return user_input;
        }
    }

}
