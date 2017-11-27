package com.launchcode.moeller; /**
 * Created by Nick on 8/9/2017.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Greedy {

    public static void main(String[] varArgs) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Greedy greedy =
                (Greedy) context.getBean("greedy");

        greedy.start();
    }

    private Validation validation;

    public Greedy(Validation validation) {
        this.validation = validation;
    }

    private void start() {

        String input_amount;
        System.out.println("Enter your currency as $0.00 or €0.00");
        Scanner console = new Scanner(System.in);
        input_amount = console.nextLine();
        validation.validate(input_amount);

    }
}







