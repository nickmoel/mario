package com.launchcode.moeller;

import org.springframework.stereotype.Component;

/**
 * Created by Nick on 11/14/2017.
 */

@Component
public class Validation {

    private CurrencyChoice currencyChoice;

    public Validation(CurrencyChoice currencyChoice) {
        this.currencyChoice = currencyChoice;
    }

    private boolean isValid(String input_amount) {
        return input_amount.matches("^[$€]\\d+\\.\\d{2}$");
    }

    void validate(String input_amount) {
        if (isValid(input_amount)) {
            System.out.println("You entered: " + input_amount);
            System.out.println("The fewest possible coins is: " + currencyChoice.createCurrency(input_amount).calculateChange());

        } else {
            System.out.println("Invalid input. ");
            System.out.println("Enter your currency as $0.00 or €0.00");

        }
    }
}