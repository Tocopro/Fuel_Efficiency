
package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        System.out.println("Fuel Efficiency Monitor");

        Scanner userObj = new Scanner(System.in);

        // Enter the Make and Model of the Vehicle

        System.out.println("Enter the Vehicle Make and Model");
        String vehicle_make = userObj.nextLine();
        String vehicle_model = userObj.nextLine();

        Scanner units = new Scanner(System.in);

        // Enter the Distance travelled

        System.out.println("Enter the Kilometers travelled: ");
        float distance = units.nextFloat();

        // Enter the Liters of petrol used

        System.out.println("Enter the Liters of Petrol Used: ");
        float liters = units.nextFloat();

        // Calculate the efficiency

        System.out.println("Fuel Efficiency in Liters per 100 Kilometers");
        float exact_distance = (float) distance / 100;
        
        float efficiency = liters / exact_distance;
        System.out.println("Fuel efficiency is " + String.format("%.2f", efficiency) + " L/100KM");




    }
}
