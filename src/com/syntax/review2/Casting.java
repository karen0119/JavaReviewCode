package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {
        // Widening/implicit from int to double (from small to big data type)
        // used more often
        double d = 19;
        System.out.println(d); //19.0 will print


        //Narrowing/explicit from double to int (from big to small data type
        int i = (int) 19.9;
        System.out.println(i); //19 will print

    }
}
