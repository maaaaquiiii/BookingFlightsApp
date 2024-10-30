package org.example;

import java.util.Scanner;

public class ExerciseSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            printFlightMenu();
            System.out.print("Enter the destination code (MAD, PMI, VLC, ZGZ): ");
            String destinationCode = scanner.nextLine().toUpperCase();
            double price = 0;
            String city = "";

            switch (destinationCode) {
                case "MAD" -> {
                    city = "Madrid";
                    price = 120;
                }
                case "PMI" -> {
                    city = "Palma";
                    price = 240;
                }
                case "VLC" -> {
                    city = "Valencia";
                    price = 85;
                }
                case "ZGZ" -> {
                    city = "Zaragoza";
                    price = 160;
                }
                default -> throw new InvalidDestinationException("Error: Invalid destination code.");
            }

            System.out.print("Are you resident in the Balearic Islands? (yes/no) ");
            String residentResponse = scanner.nextLine().toLowerCase();
            boolean isResident = validateResidentResponse(residentResponse);
            if (isResident && "PMI".equals(destinationCode)) {
                price *= 0.25;  // 75% off
            }
            System.out.printf("The selected destination is %s\n", city);
            System.out.printf("The final price is %.2f euros\n", price);

        } catch (InvalidDestinationException | InvalidResidentResponseException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean validateResidentResponse(String residentResponse) throws InvalidResidentResponseException {
        if (residentResponse.equalsIgnoreCase("yes")) {
            return true;
        } else if (residentResponse.equalsIgnoreCase("no")) {
            return false;
        } else {
            throw new InvalidResidentResponseException("Invalid residence response. Please respond with ‘yes’ or ‘no’.");
        }
    }

    private static void printFlightMenu() {
        System.out.println("===\tAvailable Destinations Menu\t===");
        System.out.println("Code| Destination\t|\tPrice");
        System.out.println("-----------------------------");
        System.out.println("MAD\t|\tMadrid\t\t|\t120 euros");
        System.out.println("PMI\t|\tPalma\t\t|\t240 euros");
        System.out.println("VLC\t|\tValencia\t|\t85 euros");
        System.out.println("ZGZ\t|\tZaragoza\t|\t160 euros");
        System.out.println("-----------------------------");
        System.out.println("====================================");
    }


}
