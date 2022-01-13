package com.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchProcessor implements SearchService {

    private final FlightRepository flightRepository;

    public FlightSearchProcessor(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public Set<Flight> findFlightsFrom(String departure) {
        return flightRepository.getFlightDatabase().stream()
                .filter(f -> departure.equals(f.getDeparture()))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Flight> findFlightsTo(String arrival) {
        return flightRepository.getFlightDatabase().stream()
                .filter(f -> f.getDestination().equals(arrival))
                .collect(Collectors.toSet());
    }

    @Override
    public List<Flight> flightsWithStopOver(String departure, String arrival) {

        Set<Flight> flightListDeparture = findFlightsFrom(departure);
        Set<Flight> flightListDestination = findFlightsTo(arrival);
        List<Flight> flightsWithStopOver = new ArrayList<>();

        for (Flight flightFrom : flightListDeparture) {
            for (Flight flightTo : flightListDestination) {
                if (flightFrom.getDestination().equals(flightTo.getDeparture())) {
                    flightsWithStopOver.add(flightTo);
                    flightsWithStopOver.add(flightFrom);
                }
            }
        }
        return flightsWithStopOver;

    }
}
