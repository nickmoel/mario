import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by Nick on 9/8/2017.
 */

public class MetrolinkCommandLineApp {

    public static void main(String[] varArgs) {

        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("application-context.xml");
        MetrolinkCommandLineApp obj;
        obj = (MetrolinkCommandLineApp) context.getBean("metrolinkCommandLineApp");

        start();
    }
    //private Stops metroStops;

    //public MetrolinkCommandLineApp(Stops metroStops) {
       // this.metroStops = metroStops;

    //}
    //Stops metroStops = new Stops();
        //metroStops.outputStations();

    public static void start() {

        //Stops metroStops = new Stops();
        int user_input;
       // metroStops.outputStations();
        Scanner console = new Scanner(System.in);
        System.out.println("");

        System.out.println("**From the list, please input the number for " +
                "the METROLINK Station that you wish to see the next arrival time for.**");

        System.out.println("");

        user_input= console.nextInt();
        Validation.validation(user_input);
        //if (Validation.validation(user_input)){
           // System.out.println("The next arrival at " + metroStops.getStationName(user_input) + " is " + metroStops.getNextArrival(user_input));
      //  }else{
           // System.out.println("Invalid input. ");
           // System.out.println("Please make your METROLINK Station selection from 1-36.");
       // }
    }
}