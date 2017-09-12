package com.Launchcode.Moeller;
/**
 * Created by Nick on 6/30/2017.
 */
public class Pyramid {

    private int rows;

    public Pyramid(int rows) {
        this.rows = rows;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = this.rows; i >= 1; i--) {
            for (int j = 1; j <= this.rows +1; j++) {
                if (j >= i) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
