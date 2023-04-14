package com.syntax.review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        /*
        Ask the user to enter numbers 1 by 1
        UNTIL user enters NOT an integer value - then loop should stop

        Inside loop we need to calculate the sum of all entered numbers
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integer values");
        int sum=0;

        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;
        }
    }
}
