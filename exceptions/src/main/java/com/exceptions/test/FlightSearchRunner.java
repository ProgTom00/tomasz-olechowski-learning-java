package com.exceptions.test;

public class FlightSearchRunner {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        Flight flight1 = new Flight("Frankfurt Airport", "Warsaw Airport");
        Flight flight2 = new Flight("Rzeszów Airport", "Cracow Airport");
        Flight flight3 = new Flight("London Airport", "Airport does not exist");

        try {
            flightSearch.findFlight(flight1);
            flightSearch.findFlight(flight2);
            flightSearch.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found");
        }
        }
    }



