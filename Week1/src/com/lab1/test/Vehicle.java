/************************************
 * Vehicle
 * Author: Omair Duadu
 * Date: 30/01/2020
 *
 ************************************/
package com.lab1.test;

public class Vehicle {


    String OwnerName;
    String RegNumber;
    String Colour;
    String Type;
    int NoWheels;
    int MaxSpeed;

    public Vehicle(String OwnerName, String RegNumber){

        this.OwnerName= OwnerName;
        this.RegNumber= RegNumber;

    }


    public Vehicle(String OwnerName, String RegNumber, String Colour, String Type, int NoWheels, int MaxSpeed){

        this.OwnerName= OwnerName;
        this.RegNumber= RegNumber;
        this.Colour= Colour;
        this.Type= Type;
        this.NoWheels= NoWheels;
        this.MaxSpeed= MaxSpeed;

    }

    public String toString() {
        return "The Vehicle details are "+ OwnerName + " " + RegNumber+ " " +Colour+ " " + " " +Type+ " " +NoWheels+ " " +MaxSpeed;
    }

}
