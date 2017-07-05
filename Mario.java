package Mario;

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

	    Printer choice;
	    choice = output_choice.equals("c") ? new Console() : new SaveFile();

	    Pyramid pyramid = new Pyramid();
	    pyramid.setRows(n);
	    choice.print(pyramid);

	}
	}
