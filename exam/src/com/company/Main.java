package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hours;
        double payRate;
        double wages;

        Payroll payroll = new Payroll();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 7; i++) {
            do {
                System.out.println("\nEnter the hours " + (i + 1) + " employee");
                System.out.println("\nIt should be positive number");
                hours = Integer.parseInt(sc.nextLine());
            }
            while (hours < 0);

            payroll.setHours(i, hours);

            do {
                System.out.println("\nEnter the pay rate for " + (i + 1) + " employee number");
                System.out.println("\nIt should be grater than 6");
                payRate = Double.parseDouble(sc.nextLine());
            }
            while (payRate < 6.00);

            payroll.setPayRate(i, payRate);
            wages = payroll.GrossPay(i);
            payroll.setWages(i, wages);

        }

        for (int i = 0; i < 7; i++) {
            System.out.println("\nEmployee ID: " + payroll.getEmployeeId(i));
            System.out.println("\nGross pay: " + payroll.getWages(i));
        }
    }
}