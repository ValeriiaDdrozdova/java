package com.company;

public class Main {

    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Bismarck", "1936");
        ships[1] = new CruiseShip(1000);
        ships[2] = new CargoShip(40);


        for (int i = 0; i < ships.length; i++){
            System.out.println(ships[i].toString());
        }
    }
}
