package com.syntax.review3;

public class WhileLoop {
    public static void main(String[] args) {
        int time=9;

        while (time > 7){
            System.out.println("Hi");
                time--; // will print 2x
                        // use -- to decrement
        }
        System.out.println("Value of time = "+time);
    }

}
