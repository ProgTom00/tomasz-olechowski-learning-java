package com.good.patterns.challenges.flights;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class OutputService {

    private OutputService() {
    }

    public static void showSearchResults(Set<Flight> result) {
        result.stream()
                .map(flight -> flight.getDeparture() + " -> " + flight.getDestination())
                .forEach(System.out::println);
    }

    public static void showSearchResultsWithStep(List<Flight> result) {

        Collections.reverse(result);
        for (int i = 0; i < result.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(result.get(i).getDeparture() + " -> ");
            } else {
                System.out.print(result.get(i).getDestination() + " with step over in " + result.get(i).getDeparture());
            }
        }
    }
}

