package com.launchcode.moeller;

/**
 * Created by Nick on 8/9/2017.
 */

public class DollarCurrency implements Currency {

    private int totalCoins ;
    private Integer change, dollars;

    public int calculateChange(String input_amount) {
        dollars = Integer.parseInt(input_amount.substring(1, input_amount.indexOf(".")));
        change = Integer.parseInt(input_amount.substring(input_amount.length() - 2));
        processDollars();
        processQuarters();
        processDimes();
        processNickles();
        processPennies();
        return totalCoins;
    }

    public void processDollars() {
        totalCoins = totalCoins + dollars;
    }

    public void processQuarters() {
        totalCoins += change / 25;
        change = change % 25;
    }

    public void processDimes() {
        totalCoins += change / 10;
        change = change % 10;
    }

    public void processPennies() {
        totalCoins += change / 1;
        change = change % 1;
    }

    public void processNickles() {
        totalCoins += change / 5;
        change = change % 5;
    }
}