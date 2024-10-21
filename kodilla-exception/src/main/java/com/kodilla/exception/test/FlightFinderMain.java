package com.kodilla.exception.test;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

public class FlightFinderMain {
    public static void main(String[] args) {
        Flight flight = new Flight("Warszawa", "Krakow");
        FlightFinder flightFinder = new FlightFinder();

        try {
            boolean canFly = flightFinder.findFlight(flight);
            if (canFly) {
                System.out.println("Lot do " + flight.getArrivalAirport() + " jest dostępny.");
            } else {
                System.out.println("Lot do " + flight.getArrivalAirport() + " nie jest dostępny.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}