package com.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRetrieve {

    List<Flight> flightList;

    public FlightRetrieve() {

        this.flightList = new ArrayList<>();
        flightList.add(new Flight(Airport.KRAKOW.toString(), Airport.RZESZOW.toString()));
        flightList.add(new Flight(Airport.WARSZAWA.toString(), Airport.RADOM.toString()));
        flightList.add(new Flight(Airport.KATOWICE.toString(), Airport.WROCLAW.toString()));
        flightList.add(new Flight(Airport.RZESZOW.toString(), Airport.WROCLAW.toString()));
        flightList.add(new Flight(Airport.RADOM.toString(), Airport.KRAKOW.toString()));
        flightList.add(new Flight(Airport.WARSZAWA.toString(), Airport.KATOWICE.toString()));

    }

    public List<Flight> retrieve() {
        return new ArrayList<>(flightList);
    }

}