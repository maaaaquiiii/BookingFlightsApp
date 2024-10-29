package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class FlyingBookingSystem {
    private HashMap<String, Destination> destinations;
    private static final double BALEARIC_RESIDENT_DISCOUNT = 0.75;

    public FlyingBookingSystem() {
        this.destinations = new HashMap<String, Destination>();
        destinations.put("MAD", new Destination("MAD", "Madrid", 120));
        destinations.put("PMI", new Destination("PMI", "Palma", 240));
        destinations.put("MAD", new Destination("VLC", "Valencia", 85));
        destinations.put("MAD", new Destination("ZGZ", "Zaragoza", 160));
    }

    private void startBooking() {
        Scanner scanner = new Scanner(System.in);
    }
}
