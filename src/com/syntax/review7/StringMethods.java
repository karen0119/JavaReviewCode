package com.syntax.review7;

public class StringMethods {
    public static void main(String[] args) {

        String str="Hello";
        String str1="Hello";

        String str2=new String("Hello");

        System.out.println(str==str1); // true
        System.out.println(str1==str2); // false

        str.toUpperCase(); //brand new string is created and reassigned to variable str
        System.out.println(str); // Hello <-- won't work

        StringBuilder sb=new StringBuilder("Hello"); //String builder is mutable(changeable)
        sb.reverse();
        System.out.println(sb); //olleH

        sb.append("Hello"); //we have a String builder object
        str=sb.toString(); //we convert String Builder Obj to String obj
        System.out.println(str);

        // Interview Questions: Write a code to reverse a String
        String given="Class";

        StringBuilder strb=new StringBuilder(given);
        given=strb.reverse().toString();

        System.out.println(given);

        //or reverse String without using any inbuilt functions (have to use logic only)

    }

}
