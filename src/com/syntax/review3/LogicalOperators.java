package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("------ Logical AND----");
        //Ex1
        boolean loginButtonDisplayed = true;
        boolean loginClickable = true;

        if (loginButtonDisplayed && loginClickable) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
// this will print because both conditions are true
        }
        System.out.println("------ Logical OR----");
        //Ex2
        boolean pictureDisplayed = true;
        String accountName = "Syntax"; //use .equals

        if (pictureDisplayed || accountName.equals("Syntax")) {
            System.out.println("You're in");
        } else {
            System.out.println("Not login");
        }
        System.out.println("------ Logical NOT----");
        //Ex3
        boolean hungry = !true;
        System.out.println(hungry); // this will print false

        boolean cold = false;
        System.out.println(!cold); // ths will print true

        //E4
        boolean confirmSelected = true;
        if (!confirmSelected) {
            System.out.println("Click on confirm checkbox");

        }
        System.out.println("Click on pay button");
        // Click on pay button prints

    }
}
