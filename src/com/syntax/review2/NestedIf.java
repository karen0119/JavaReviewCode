package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        boolean driverLicence = true;
        boolean car = false;

        if (driverLicence) { //nested if example below
            System.out.println("let's check if you have a car");
            if (car) {
                System.out.println("You can drive to work");
            } else {
                System.out.println("You will need to take the bus");
            }
        } else {
            System.out.println("You should get a DL");
        }


    }
}
