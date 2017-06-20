package Mario;

import java.util.*;

public class Mario {


    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);

        do {
            System.out.print("How many blocks to jump between 0-23? ");
            n = console.nextInt();
        }
        while (n < 0 || n > 23);

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n +1; j++) {
                if (j >= i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
