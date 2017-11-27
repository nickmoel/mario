package com.launchcode.moeller;

/**
 * Created by Nick on 8/9/2017.
 */
public interface Currency {

    int calculateChange();

    void processDollars();

    void processDimes();

    void processNickles();

    void processPennies();


}
