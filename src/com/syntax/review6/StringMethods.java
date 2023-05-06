package com.syntax.review6;

public class StringMethods {
    public static void main(String[] args) {

     String str = new String("Hello");
        System.out.println(str);

        String word="Hello";
        System.out.println(word);

        //Methods of String class

        System.out.println("----.equals()----"); //to compare

        if (str.equals(word)){
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Strings are not equal");
                // prints: Both Strings are equal
        }
        System.out.println("--------length()-----------");

        String name = "Farwa";
        int numberOfCharacters = name.length();
        System.out.println(numberOfCharacters); // 5

        System.out.println("--------substring()-----------");

        String sentence = "Hello Batch 16";
        String part = sentence.substring(6);
        System.out.println(part); //Batch 16

        String part1=sentence.substring(0,5);
        System.out.println(part1); //Hello

    }
}
