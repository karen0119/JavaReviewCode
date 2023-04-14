package com.syntax.review4;

public class ArrayReview {
    public static void main(String[] args) {

       // Example 1
        int[] arr = new int[3]; //multiple values
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 11;

        System.out.println(arr[1]);

        System.out.println(); // for line space

        // Example 2
        String[] planets={"Earth","Mars","Jupiter","Saturn","Neptune"};
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i]+" ");


        // Example 3
            String[] planet={"Earth","Mars","Jupiter","Saturn","Neptune"};
              for(String Planets : planet) {
                  System.out.println(Planets);
              }
        }
    }
}
