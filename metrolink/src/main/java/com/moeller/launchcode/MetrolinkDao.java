package com.moeller.launchcode;

import java.util.List;

/**
 * Created by Nick on 9/8/2017.
 */
public interface MetrolinkDao {
    public List<Station> getStopsAllStops();

    public List<String> getArrivals();



}