package com.syntax.review2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        int i = 10;
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter full sentence");
        String sentence = key.nextLine();
        System.out.println(sentence);

        System.out.println("Please enter 1 word");
        String word = key.next(); //must use this with scanner
        System.out.println("Word that was captured = " + word);

        System.out.println("Please enter integer value");
        int number = key.nextInt();
        System.out.println("Entered number is = " + number);
        
        System.out.println("Please enter a decimal value");
        double decimal = key.nextDouble();
        System.out.println("Decimal value = " + decimal);


    }
}
