package com.Launchcode.Moeller;

/**
 * Created by Nick on 7/7/2017.
 */
public class PyramidFactory {
    public static Pyramid withRows(int rows) {
        Pyramid pyramid = new Pyramid();
        pyramid.setRows(rows);

        return pyramid;
    }
}