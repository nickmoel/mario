package com.moeller.launchcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Created by Nick on 9/8/2017.
 */
@Component
public class MetrolinkCommandLineApp {

    public static void main(String[] varArgs) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        MetrolinkCommandLineApp metrolinkCommandLineApp =
                (MetrolinkCommandLineApp) context.getBean("metrolinkCommandLineApp");

        metrolinkCommandLineApp.start();
    }
    @Autowired
    public Validation validation;
    @Autowired
    public Stops stops;

    private void start() {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        int user_Input;
        stops.outputStations();
        System.out.println("");
        System.out.println("");
        System.out.println("**From the list, please input the number for " +
                "the METROLINK Station that you wish to see the next arrival time for.**");

        System.out.println("");
        Scanner console = new Scanner(System.in);
        user_Input= console.nextInt();

        validation.validate(user_Input);

    }
}