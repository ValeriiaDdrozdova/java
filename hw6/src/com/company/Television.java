package com.company;

public class Television {

    // The purpose of this class is to model a television
    // Your name and today’s date

    private static String MANUFACTURER;   //The manufacturer holds the brand name.
    private static int SCREEN_SIZE;       //The screenSize holds the size of the television screen
    private boolean powerOn;              //The powerOn holds the value true if the power is on
                                          //and false if the power is off.
    private int channel;                  // The channel holds the value of the station that the television is showing.
    private int volume;                   //The volume holds a number value representing the loudness

    /**
     Constructor
     @param manufacturer The manufacturer holds the brand name.
     @param screenSize //The screenSize holds the size of the television screen
     */
    public Television (String manufacturer, int screenSize)
    {
        MANUFACTURER = manufacturer;
        SCREEN_SIZE = screenSize;
        powerOn = false;
        volume = 20;
        channel = 2;
    }

    //The getChannel method will return the
    //value in an object’s channel field.
    public int getChannel(){
        return channel;
    }

    //The getVolume method will return the
    //value in an object’s volume field.
    public int getVolume(){
        return volume;
    }

    //The getManufacturer method will return the
    //value in an object’s MANUFACTURER field.
    public String getManufacturer(){
        return MANUFACTURER;
    }

    //The getScreenSize method will return the
    //value in an object’s SCREEN_SIZE field.
    public int getScreenSize(){
        return SCREEN_SIZE;
    }

    //The setChannel method will store a
    //value in an object’s channel field.
    public void setChannel(int station){
        channel = station;
    }

    //The power method will toggle the power between on and off, changing
    //the value stored in the powerOn field from true to false or from false to
    //true.
    public void power(){
        powerOn = !powerOn;
    }

    //The increaseVolume method will increase the value
    //stored in the volume field by 1.
    public void increaseVolume(){
        volume++;
    }

    //The decreaseVolume method will decrease the value
    //stored in the volume field by 1.
    public void decreaseVolume(){
        volume--;
    }

}
