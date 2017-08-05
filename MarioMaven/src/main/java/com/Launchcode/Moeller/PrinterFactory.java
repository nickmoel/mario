package com.Launchcode.Moeller;

import org.springframework.stereotype.Component;

/**
 * Created by Nick on 7/10/2017.
 */
@Component
public class PrinterFactory {


    public PrinterFactory(Console console, SaveFile saveFile) {

    }

    public static Printer createPrinter(String output_choice) {

        Printer choice = "c".equals(output_choice) ? PrinterFactory.console() : PrinterFactory.saveFile();
        return choice;
    }

    public static Printer console() {
        return new Console();
    }
    public static Printer saveFile() {
        return new SaveFile();
    }



}
