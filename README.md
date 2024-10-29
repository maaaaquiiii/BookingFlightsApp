# Flight Booking Program
## Overview
The Flight Booking Program is a Java application that allows users to select a flight destination 
and check the final price based on their residency status. 
This program handles various user inputs, applies discounts where applicable, 
and ensures robust error handling for invalid inputs.
## Features
Destination Selection: Users can choose from the following destinations:
````
MAD (Madrid) - 120 €
PMI (Palma) - 240 €
VLC (Valencia) - 85 €
ZGZ (Zaragoza) - 160 €
````
- Resident Discount: If the user is a resident of the Balearic Islands, a 75% discount is applied to the price of the flight to Palma.

- Case-Insensitive Input: The program accepts destination codes in a case-insensitive manner (e.g., "mad", "Mad", "MAD").

- Error Handling: If the user enters an invalid destination code, the program provides an appropriate error message.

- Final Output: The program outputs the selected destination and the final price in euros.

## Usage
1. Run the program using a Java-compatible environment.
2. When prompted, enter the flight destination code (e.g., MAD, PMI, VLC, ZGZ).
3. Indicate if you are a resident of the Balearic Islands (yes/no).
4. The program will display the selected destination and the final price.

## Example Output
```
Menu of flights:
Code  | Destination | Price
-----------------------------
MAD   | Madrid      | 120 euros
PMI   | Palma       | 240 euros
VLC   | Valencia    | 85 euros
ZGZ   | Zaragoza    | 160 euros
-----------------------------

Enter the destination code (MAD, PMI, VLC, ZGZ): PMI
Are you a resident of the Balearic Islands? (yes/no): yes
The selected destination is Palma
The final price is 60.00 euros
```
## Development
### Technologies Used
- Programming Language: Java
- Development Environment: Any Java IDE (e.g., IntelliJ IDEA, Eclipse)
### Code Structure
The main class of the application is ``FlightBooking``. It handles:
- Input and output through the console.
- Logic for selecting destinations and calculating prices.
- Validation of user inputs.
### Exception Handling
Custom exceptions are used to handle invalid destination codes and resident responses, 
ensuring the program can gracefully inform users of input errors.

### Future Improvements
- User Interface: Consider developing a graphical user interface (GUI) for better user interaction.
- Database Integration: Store destination details in a database for easier management and updates.
- Internationalization: Support multiple languages for wider accessibility.
