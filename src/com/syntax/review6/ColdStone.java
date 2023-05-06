package com.syntax.review6;

public class ColdStone {
    public static void main(String[] args) {

        // to create an object of ice cream class

        IceCream iCream = new IceCream();

        iCream.flavor = "Vanilla";
        iCream.color = "White";
        iCream.dairyFree = false;
        iCream.price = 2.99;

        iCream.eat(); //We can eat Vanilla ice cream
        iCream.buy(); //Vanilla ice cream cost 2.99

        System.out.println("---2nd Ice Cream-----");

        IceCream iCream2 = new IceCream();
        iCream2.flavor = "Pistachio";
        iCream2.color = "Green";
        iCream2.dairyFree = true;
        iCream2.price = 5.99;

        iCream2.eat(); //We can eat Pistachio ice cream
        iCream2.buy(); //Pistachio ice cream cost 5.99
    }
}
