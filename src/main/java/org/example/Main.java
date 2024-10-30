package org.example;

public class Main {
    public static void main(String[] args) {
        FlightBookingSystem bookingSystem = new FlightBookingSystem();
        mostrarMenuDestinos(bookingSystem);
        bookingSystem.startBooking();
    }

    private static void mostrarMenuDestinos(FlightBookingSystem bookingSystem) {
        System.out.println("===\tAvailable Destinations Menu\t===");
        for (Destination destination : bookingSystem.getDestinations().values()) {
            System.out.printf("Code: %s\t|\tDestination: %s\t|\tPrice: %.2f euros\n",
                    destination.getCode(), destination.getCity(), destination.getPrice());
        }
        System.out.println("====================================");
    }
}