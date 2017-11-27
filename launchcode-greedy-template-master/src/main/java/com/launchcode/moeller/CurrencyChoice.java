package com.launchcode.moeller;
/**
 * Created by Nick on 8/11/2017.
 */

import org.springframework.stereotype.Component;


@Component
public class CurrencyChoice {

    private Currency choice;
    private String input_amount;



    public void setChoice(Currency choice) {
        this.choice = choice;
    }

    private CurrencyChoice currencyChoice;

    public void setCurrencyChoice(CurrencyChoice currencyChoice) {
        this.currencyChoice = currencyChoice;
    }

    private DollarCurrency dollarCurrency;

    private EuroCurrency euroCurrency;

    public CurrencyChoice(DollarCurrency dollarCurrency, EuroCurrency euroCurrency) {
        this.dollarCurrency = dollarCurrency;
        this.euroCurrency = euroCurrency;
    }

    public Currency createCurrency(String input_amount) {

        if (input_amount.startsWith("$")) {
            choice = currencyChoice.dollarCurrency(input_amount);
        } else choice = currencyChoice.euroCurrency(input_amount);
        return choice;
    }

    public Currency dollarCurrency(String input_amount) {
        parseChange(input_amount);
        parseDollars(input_amount);


        return new DollarCurrency();
    }

    public Currency euroCurrency(String input_amount) {
        return new EuroCurrency();
    }

    public Integer parseDollars(String input_amount) {
        int dollars = Integer.parseInt(input_amount.substring(1, input_amount.indexOf(".")));
        return dollars;
    }

    public Integer parseChange(String input_amount) {
        int change = Integer.parseInt(input_amount.substring(input_amount.length() - 2));
        return change;

    }
}