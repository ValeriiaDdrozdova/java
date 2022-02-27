package com.company;
import java.util.Scanner;

public class Payroll {

    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    public int getEmployeeId(int index) {
        return employeeId[index];
    }
    public void setEmployeeId(int index, int ID) {
        employeeId[index] = ID;
    }

    public int getHours(int index) {
        return hours[index];
    }
    public void setHours(int index, int hour) {
            hours[index] = hour;
    }

    public double getPayRate(int index) {
        return payRate[index];
    }
    public void setPayRate(int index, double payrate) {
            payRate[index] = payrate;
    }

    public double getWages(int index) {
        return wages[index];
    }
    public void setWages(int index, double wage) {
        wages[index] = wage;
    }


    public double GrossPay(int theEmployeeId) {

        double grossPay = 0;
        int h = hours[theEmployeeId];
        double payR = payRate[theEmployeeId];
        grossPay = (h * payR);

        return grossPay;
    }
}
