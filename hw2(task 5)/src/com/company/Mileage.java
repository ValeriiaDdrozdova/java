package com.company;
import java.util.Scanner;

/**
 This program calculates gas mileage in miles per gallon.
 Valeriia Drozdova 51810 07.03.2021
 */


public class Mileage
{
    public static void main(String[] args)
    {
        //Creating a Scanner object
        Scanner keyboard = new Scanner(System.in);           //creating new scanner

        // Identifier declarations
        int miles;
        int gallons;
        int milesPerGallon;

        //Asking user and getting input
        System.out.println("this program will calculate mileage"); //telling what is this program about
        System.out.println("Enter driven miles: ");          //asking user
        miles = Integer.parseInt(keyboard.nextLine());       //Read in miles driven
        System.out.println("Enter used gallons: ");          //asking user
        gallons = Integer.parseInt(keyboard.nextLine()); //Read in gallons used
        //Calculating
        milesPerGallon = miles/gallons;                  //Calculate miles per gallon
        //Printing the result
        System.out.println("Miles per gallons: " + milesPerGallon); //Printing
    }
}

