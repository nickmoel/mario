package com.launchcode.moeller;
/**
 * Created by Nick on 8/11/2017.
 */

import org.springframework.stereotype.Component;


@Component
public class CurrencyChoice {

    public CurrencyChoice(DollarCurrency dollarCurrency, EuroCurrency euroCurrency) {
    }

    public static Currency createCurrency(String input_amount) {

        Currency choice;
        if (input_amount.startsWith("$")) choice = CurrencyChoice.dollarCurrency();
        else choice = CurrencyChoice.euroCurrency();
        return choice;
    }

    public static Currency dollarCurrency() {
        return new DollarCurrency();
    }

    public static Currency euroCurrency() {
        return new EuroCurrency();
    }


}