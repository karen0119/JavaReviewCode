package com.syntax.review6;

public class Task10 {
    public static void main(String[] args) {

        // Write a program to print out duplicate elements from an Array of Strings?

        String[] baking = {"spatula", "measuring cups", "cake batter", "cake batter"};

        for (int i = 0; i < baking.length; i++) {
            for (int j = i + 1; j < baking.length; j++) {
                if (baking[i].equals(baking[j])) { // use equals instead of == b/c of String variable

                    System.out.println("The duplicate elements is " + baking[j]);
                    // Prints: The duplicate elements is cake batter
                }
            }
        }
    }
}
 // use j = i + 1 <-- to compare to first element