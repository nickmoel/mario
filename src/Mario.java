/**
 * Created by Nick on 6/30/2017.
 */
import java.util.*;


public class Mario {

    public static void main(String[] args) {
        int n;
        String output_choice;
        Scanner console = new Scanner(System.in);

        do {
            System.out.print("How many blocks to jump between 0-23? ");
            n = console.nextInt();
        }
        while (n < 0 || n > 23);

        do {
            System.out.print("press c for console or f for text file:");
            output_choice = console.next();
        }while (!((output_choice.equals("c")) || (output_choice.equals("f"))));

        PrinterFactory.createPrinter(output_choice).print(PyramidFactory.withRows(n));

    }
}

