package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Warszawa", true);
        availableAirports.put("Poznan", true);
        availableAirports.put("Wroclaw", true);
        availableAirports.put("Szczecin", true);
        availableAirports.put("Lodz", false);

        String arrivalAirport = flight.getArrivalAirport();
        if (!availableAirports.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Lotnisko " + arrivalAirport + " nie jest w tej chwili dostepne");
        }

        return availableAirports.get(arrivalAirport);
    }
}

