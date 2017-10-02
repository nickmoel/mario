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

    private Validation validation;

    public MetrolinkCommandLineApp(Validation validation) {
        this.validation = validation;

    }

    public static void start() {

        Stops metroStops = new Stops();
        int user_input;
        metroStops.outputStations();
        System.out.println("");
        System.out.println("");
        System.out.println("**From the list, please input the number for " +
                "the METROLINK Station that you wish to see the next arrival time for.**");

        System.out.println("");
        Scanner console = new Scanner(System.in);
        user_input= console.nextInt();

        Validation.getValidation(user_input);

    }
}