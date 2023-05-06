package com.syntax.review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String day = "Thursday";
        // .charAt
       char character = day.charAt(2);
        System.out.println(character); // u

        // .indexOf
       int index = day.indexOf('s');
        System.out.println(index); //4

        // .split
        String food = "I like indian food";
        String[] words = food.split(" ");
        for(String word :words) {
            System.out.println(word); // prints each word by itself

        }
    }
}
