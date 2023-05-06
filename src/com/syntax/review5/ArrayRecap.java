package com.syntax.review5;

public class ArrayRecap {
        public static void main(String[] args) {
            // Print elements in reverse order

            String[] languages = {"English", "Russian", "Turkish", "French", "Spanish", "German"};

            // regular order
            for (String language : languages) {
                System.out.print(language + " ");
            }

            System.out.println(" ----------   REVERSE  -----------    ");

            // reverse order
            for (int i = languages.length - 1; i >= 0; i--) {
                System.out.print(languages[i] + " ");
            }

        }
    }

