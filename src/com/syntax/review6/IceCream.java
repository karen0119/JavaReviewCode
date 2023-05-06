package com.syntax.review6;

public class IceCream {

    // Class template/blueprint

    // defined attributes
    String flavor, color;
    boolean dairyFree;
    double price;

    // defined methods/behavior
    // methods are used to reuse a block of code
    void eat (){
        System.out.println("We can eat "+flavor+" ice cream");
    }
    void buy (){
        System.out.println(flavor+" ice cream cost "+price);
    }
}
