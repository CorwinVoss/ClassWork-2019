package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car bakerCar = new Car();
        Car peteCar = new Car("Ford", "Mustang", 10, 15);
        peteCar.driveUntilEmpty();
        System.out.println(peteCar.milesTraveled);
        peteCar.fillTank();
        peteCar.drive(120);
        System.out.println(peteCar.milesTraveled);
        peteCar.drive(120);
        System.out.println(peteCar.milesTraveled);
    }
}
