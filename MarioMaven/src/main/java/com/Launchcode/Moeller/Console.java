package com.Launchcode.Moeller;

import org.springframework.stereotype.Component;

/**
 * Created by Nick on 7/31/2017.
 */
@Component
public class Console implements Printer {
    public Console(){    }
    
    private static Console console;

    public static Console getInstance(){
        if (console == null){
            console = new Console();
        }
        return console;
    }



    //@Override
    public void print(Pyramid pyramid){
        System.out.print(pyramid.toString());
    }
}
