package com.exceptions.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {


    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Frankfurt Airport", true);
        flightsMap.put("Warsaw Airport", true);
        flightsMap.put("Cracow Airport", false);
        flightsMap.put("Rzeszów Airport", true);
        flightsMap.put("London Airport", false);
        flightsMap.put("Madrid-Barajas Airport", true);

        if (flightsMap.containsKey(flight.getArrivalAirport())) {
            boolean fly = flightsMap.entrySet().stream()
                    .filter(e -> e.getKey().equals(flight.getArrivalAirport()))
                    .anyMatch(e -> e.getValue().equals(true));
            if (fly) {
                System.out.println(flight.getDepartureAirport() + " flight is available to " + flight.getArrivalAirport());
            } else {
                System.out.println(flight.getDepartureAirport() + " flight is not available to " + flight.getArrivalAirport());
            }
        } else {
            throw new RouteNotFoundException();

        }
    }
}
