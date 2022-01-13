package com.good.patterns.challenges.flights;

import lombok.Getter;

@Getter
public class Flight {
    private final String departure;
    private final String destination;

    public Flight(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!departure.equals(flight.departure)) return false;
        return destination.equals(flight.destination);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }


}
