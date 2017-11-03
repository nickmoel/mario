package com.launchcode.moeller;

/**
 * Created by Nick on 8/9/2017.
 */
public interface Currency {
    int calculateChange(String input_amount);

    void processDollars();

    void processDimes();

    void processNickles();

    void processPennies();
}
