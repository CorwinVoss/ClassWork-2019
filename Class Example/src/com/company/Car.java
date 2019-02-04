package com.company;

/**
 * Created by cv1900 on 2/1/2019.
 */
public class Car {
    //properties
    String make;
    String model;
    double milesTraveled;
    double mpg;
    double tankSize;
    double gallonsOfGas;

    //constructor(s)
    public Car(){
        make = "Ford";
        model = "Escape";
        milesTraveled = 0;
        mpg = 24;
        tankSize = 12;
        gallonsOfGas = tankSize;
    }
    public Car(String make, String model, double mpg, double tankSize){
        this.make = make;
        this.model = model;
        this.mpg = mpg;
        this.tankSize = tankSize;
        gallonsOfGas = tankSize;
        milesTraveled = 0;
    }

    //methods
    public void driveUntilEmpty(){
        milesTraveled = milesTraveled + mpg * gallonsOfGas;
        gallonsOfGas = 0;
    }

    public void fillTank(){
        gallonsOfGas = tankSize;
    }

    public void drive(double miles){
        if ((gallonsOfGas - miles / mpg) >= 0){
            milesTraveled += miles;
            gallonsOfGas -= miles / mpg;
        } else {
            driveUntilEmpty();
        }
    }
}
