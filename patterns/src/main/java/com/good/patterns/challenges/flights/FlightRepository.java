package com.good.patterns.challenges.flights;

import lombok.Getter;

import java.util.List;

@Getter
public class FlightRepository {
    private final List<Flight> flightDatabase;

    public FlightRepository(List<Flight> flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

}
