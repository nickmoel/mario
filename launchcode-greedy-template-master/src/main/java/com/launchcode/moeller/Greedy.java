package com.launchcode.moeller; /**
 * Created by Nick on 8/9/2017.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Greedy {


    public static void main(String[] varArgs) {

        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("application-context.xml");
        Greedy obj;
        obj = (Greedy) context.getBean("greedy");

        start();

    }

    private CurrencyChoice currencyChoice;

    public Greedy(CurrencyChoice currencyChoice) {
        this.currencyChoice = currencyChoice;

    }

    public static void start() {

        String input_amount;
        System.out.println("Enter your currency as $0.00 or €0.00");
        Scanner console = new Scanner(System.in);
        input_amount = console.nextLine();
        validation(input_amount);

    }

    public static boolean validation(String input_amount) {

        if (input_amount.matches("^[$€]\\d+\\.\\d{2}$")) {
            System.out.println("You entered: " + input_amount);
            System.out.println("The fewest possible coins is: " + CurrencyChoice.createCurrency(input_amount).calculateChange(input_amount));
            return true;
        } else {
            System.out.println("Invalid input. ");
            System.out.println("Enter your currency as $0.00 or €0.00");

            return false;

        }
    }
}




