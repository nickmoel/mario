package com.launchcode.moeller;

import org.springframework.stereotype.Component;

/**
 * Created by Nick on 8/9/2017.
 */
@Component
public class DollarCurrency implements Currency {

    private int totalCoins ;
    public int change, dollars;



    public int calculateChange() {
     
       // dollars = Integer.parseInt(input_amount.substring(1, input_amount.indexOf(".")));
        //change = Integer.parseInt(input_amount.substring(input_amount.length() - 2));

        processDollars();
        processQuarters();
        processDimes();
        processNickles();
        processPennies();
        return totalCoins;
    }

    public void processDollars() {
        System.out.println(totalCoins + "total coins before");
        totalCoins = totalCoins + dollars;
        System.out.println(totalCoins + "dollars");
        System.out.println(totalCoins + "total coins after");

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