package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class FlightBookingSystem {
    private HashMap<String, Destination> destinations;
    private static final double BALEARIC_RESIDENT_DISCOUNT = 0.25; //75% off

    //Constructor
    public FlightBookingSystem() {
        this.destinations = new HashMap<String, Destination>();
        destinations.put("MAD", new Destination("MAD", "Madrid", 120));
        destinations.put("PMI", new Destination("PMI", "Palma", 240));
        destinations.put("VLC", new Destination("VLC", "Valencia", 85));
        destinations.put("ZGZ", new Destination("ZGZ", "Zaragoza", 160));
    }

    //Getters
    public HashMap<String, Destination> getDestinations() {
        return destinations;
    }

    public void startBooking() {
        Scanner scanner = new Scanner(System.in);

        try {
            Destination selectedDestination = selectDestination(scanner);
            boolean isResident = checkResidentStatus(scanner);

            double finalPrice = calculatePrice(selectedDestination, isResident);

            System.out.println("The selected destination is " + selectedDestination.getCity());
            System.out.printf("The final price is %.2f euros\n", finalPrice);
        } catch (InvalidDestinationException | InvalidResidentResponseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Destination selectDestination(Scanner scanner) throws InvalidDestinationException {
        System.out.print("Enter the destination code (MAD, PMI, VLC, ZGZ): ");
        String destinationCode = scanner.nextLine().toUpperCase();

        Destination selectedDestination = destinations.get(destinationCode);
        if (selectedDestination == null) {
            throw new InvalidDestinationException("Error, invalid destination code");
        }
        return selectedDestination;
    }

    private boolean checkResidentStatus(Scanner scanner) throws InvalidResidentResponseException {
        System.out.println("Are you resident in the Balearic Islands? (yes/no) ");
        String residentResponse = scanner.nextLine().toLowerCase();

        if (residentResponse.equalsIgnoreCase("yes")) {
            return true;
        } else if (residentResponse.equals("no")) {
            return false;
        } else {
            throw new InvalidResidentResponseException("Invalid residence response. Please respond with ‘yes’ or ‘no’.");
        }
    }

    private double calculatePrice(Destination destination, boolean isResident) {
        double price = destination.getPrice();
        if(isResident && "PMI".equals(destination.getCode())) {
            return price * BALEARIC_RESIDENT_DISCOUNT;
        }
        return price;
    }
}
