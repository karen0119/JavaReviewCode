package com.syntax.review2;

public class AnotherNestedIf {
    public static void main(String[] args) {

        boolean covidVaccine= false;
        int dose=1;

        if (covidVaccine){

            if (dose==1){
            System.out.println("You need second dose");
        } else if (dose==2){
                System.out.println("Fully vaccinated");
            } else if (dose==3) {
                System.out.println("Vaccine with booster");
            }

            } else {
            System.out.println("You need covid vaccine"); // this will print
        }

        }
}
