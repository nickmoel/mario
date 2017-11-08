package com.launchcode.moeller;

/**
 * Created by Nick on 8/15/2017.
 */

public class EuroCurrency implements Currency {

    private int totalCoins;
    private Integer change, dollars;

    public int calculateChange(String input_amount) {
        dollars = Integer.parseInt(input_amount.substring(1, input_amount.indexOf(".")));
        change = Integer.parseInt(input_amount.substring(input_amount.length() - 2));
        processTwoDollars();
        processDollars();
        process_halfEuro();
        process_twentyCent();
        processDimes();
        processNickles();
        process_twoCent();
        processPennies();
        return totalCoins;

    }

    public void processTwoDollars() {
        totalCoins = totalCoins + dollars / 2;
        dollars = dollars % 2;
    }

    public void processDollars() {
        totalCoins = totalCoins + dollars;
    }

    public void process_halfEuro() {
        totalCoins += change / 50;
        change = change % 50;
    }

    public void process_twentyCent() {
        totalCoins += change / 20;
        change = change % 20;
    }

    public void processDimes() {
        totalCoins += change / 10;
        change = change % 10;
    }

    public void processNickles() {
        totalCoins += change / 5;
        change = change % 5;
    }

    public void processPennies() {
        totalCoins += change;
    }

    public void process_twoCent() {
        totalCoins += change / 2;
        change = change % 2;
    }
}

