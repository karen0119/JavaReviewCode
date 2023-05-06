package com.syntax.review7;

public class MethodsTest {
    public static void main(String[] args) {

        JavaMethods jm = new JavaMethods(); // declaring an object of the JavaMethods class first

        //Declaring the methods
        jm.hello(); //Hello
        jm.helloName("Leo"); //Hello Leo
        // jm.helloName('J'); won't print b/c the parameter is a String not

       double temp=jm.convertTemp(36.6); //create a variable in order to print return
        System.out.println(temp); //97.88000000000001

        String [] arr=jm.words("Today is May 4");
        for(String str:arr){    //create enhanced loop to get he return
            System.out.println(str);
        }

    }
}
