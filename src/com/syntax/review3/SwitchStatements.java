package com.syntax.review3;

public class SwitchStatements {
    public static void main(String[] args) {

        String color="red";

        switch (color){
            case "red":
                System.out.println("Stop");
                break;

            case "orange":
                System.out.println("Yield");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Unknown");

                // "Stop" will print
        }
    }
}
