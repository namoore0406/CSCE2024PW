import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to ShipNavigator!!!");

        boolean continueCreating = true;

        while (continueCreating) {
            System.out.print("Enter the name of the ship: ");
            String name = key.nextLine();

            System.out.print("Enter its launch date (mm/dd/yyyy): ");
            String launchDate = key.nextLine();

            System.out.print("Is it a cruise ship or a cargo ship? ");
            String type = key.nextLine().toLowerCase();

            if (type.equals("cruise ship")) {
                System.out.print("Enter the ship's passenger capacity: ");
                int passengerCapacity = key.nextInt();

                System.out.print("How many crew members are on this ship? ");
                int crewMembers = key.nextInt();
                key.nextLine(); 

                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengerCapacity, crewMembers);
                System.out.println("Creating a cruise ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);

            } else if (type.equals("cargo ship")) {
                System.out.print("Enter the ship's tonnage (DWT): ");
                int tonnage = key.nextInt();

                System.out.print("Enter the maximum speed of the ship (in mph): ");
                double maxSpeed = key.nextDouble();
                key.nextLine(); // Consume newline

                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
                System.out.println("Creating a cargo ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);

            } else {
                System.out.println("Error: Invalid ship type entered.");
            }

            System.out.print("Do you want to construct another ship object? Enter yes or no: ");
            String response = key.nextLine().toLowerCase();
            continueCreating = response.equals("yes");
        }

        System.out.println("Goodbye!");
        
    }
}