//@author Maddison Kiefer

import java.util.Scanner;

public class CalculateMPG {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // Creating the variables
        String carBrand;
        String carModel;
        int carYear;
        int startOdometerReading;
        int endOdometerReading;
        double gallonsUsed;
        double milesDriven;
        double milesPerGallon;
        
        // Receiving inputs
        System.out.print("Enter you car brand: ");
        carBrand = scnr.nextLine();
        
        System.out.print("Enter you car model: ");
        carModel = scnr.nextLine();
        
        System.out.print("Enter your car year: ");
        carYear = scnr.nextInt();
        
        System.out.print("Enter your starting odometer reading: ");
        startOdometerReading = scnr.nextInt();
        
        System.out.print("Enter your ending odometer reading: ");
        endOdometerReading = scnr.nextInt();
        
        System.out.print("Enter your gallons used: ");
        gallonsUsed = scnr.nextDouble();
        
        // Calculating the miles per gallon
        milesDriven = endOdometerReading - startOdometerReading;
        milesPerGallon = milesDriven / gallonsUsed;
        
        // Outputting the information
        System.out.println("");
        System.out.println("Car Information");
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Year: " + carYear);
        System.out.println("Starting Odometer Reading: " + startOdometerReading);
        System.out.println("Ending Odometer Reading: " + endOdometerReading);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.printf("MPG: " + "%.3f\n", milesPerGallon);
    }
}
