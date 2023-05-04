package org.example;

import org.example.ex12.Circle;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("2 power 10 is " + Math.pow(2, 10));
        System.out.printf("int has 4 bytes and %.0f possible values. %n", Math.pow(2, 4*8));
        System.out.printf("long has 8 bytes and %.0f possible values. %n", Math.pow(2, 8*8));

        System.out.println("Area of circle with radios 15: " + Circle.area(15));
    }
}
