import org.springframework.stereotype.Component;

/**
 * Created by Nick on 9/19/2017.
 */
@Component
 class Validation {


    Stops metroStops;

    public void setMetroStops(Stops metroStops) {
        this.metroStops = metroStops;
    }

    void validate(int user_Input) {

        if (user_Input>= 0 && user_Input < 36) {
            System.out.println("The next arrival at " + metroStops.getStationName(user_Input) + " is at " + metroStops.getNextArrival(user_Input));

        } else {
            //return user_Input;
            System.out.println("Invalid input. ");
            System.out.println("Please make your METROLINK Station selection from 0-35.");
           // return user_Input;
        }
    }

}
