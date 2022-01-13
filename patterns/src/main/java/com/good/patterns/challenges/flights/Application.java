package com.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        FlightRetrieve flightRetrieve = new FlightRetrieve();
        FlightRepository flightRepository = new FlightRepository(flightRetrieve.retrieve());

        FlightSearchProcessor flightSearchProcessor = new FlightSearchProcessor(flightRepository);

        OutputService.showSearchResults(flightSearchProcessor.findFlightsFrom(Airport.WARSZAWA.toString()));
        OutputService.showSearchResults(flightSearchProcessor.findFlightsTo(Airport.KRAKOW.toString()));
        OutputService.showSearchResultsWithStep(flightSearchProcessor.flightsWithStopOver(Airport.WARSZAWA.toString(),
                Airport.WROCLAW.toString()));

    }
}
