package com.company;
import java.util.Scanner;

public class Average {

    private int[] data;
    private double mean;

    Scanner keyboard = new Scanner (System.in);

    public Average(){
        data = new int[5];
        for(int i = 0; i < data.length;  i++){
            System.out.print("Please enter score number " + (i+1) + ", ");
            data [i] = keyboard.nextInt();
        }
        selectionSort();
        calculateMean();
    }

    public void selectionSort(){
        int highest = data[0];
        for (int i = 1; i < data.length; i++)
        {
            if (data[i] > highest)
                highest = data[i];
        }
    }

    public void calculateMean(){
        double total = 0;
        for (int i = 0; i < data.length; i++)
            total += data[i];
        mean = total / data.length;
    }

    public String toString(){
        String arreyToString = "";
        for (int i = 0; i < data.length; i++){
            arreyToString += data[i] + " ";
        }
        return arreyToString + " " + mean;
    }
}
