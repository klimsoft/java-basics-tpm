package org.example;

public class Ex03 {

    public static void main(String[] args) {
        long bigNumber = 10_000_000_000L;
        int myInt = (int)bigNumber;
        float myFloat = (float) bigNumber;

        System.out.println("bigNumber:" + bigNumber );
        System.out.println("as int:" + myInt);
        System.out.println("as float:" + myFloat);

    }

}
