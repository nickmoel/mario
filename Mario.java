package Mario;/**
 * Created by Nick on 6/21/2017.
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


        PyramidPrinter choice;
        choice = output_choice.equals("c") ? new PyramidScreenPrinter() : new PyramidFilePrinter();


        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n +1; j++) {
                if (j >= i) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        choice.print(sb);
    }
}
