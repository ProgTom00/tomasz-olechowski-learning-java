package com.good.patterns.challenges.flights;

import java.util.List;
import java.util.Set;

public interface SearchService {
    Set<Flight> findFlightsFrom(String destination);
    Set<Flight> findFlightsTo(String arrival);
    List<Flight> flightsWithStopOver(String destination, String arrival);
}
