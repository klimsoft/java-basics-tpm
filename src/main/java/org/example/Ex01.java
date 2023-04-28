package org.example;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myInt = 100;
        long myLong = 200L;
        float myFloat = 33.3F;
        double myDouble = 45.6789D;
        String myString = "My String";

        System.out.println("myInt:" + myInt);
        System.out.println("myLong:" + myLong);
        System.out.println("myFloat:" + myFloat);
        System.out.println("myDouble:" + myDouble);
        System.out.println("myString:" + myString);


        //About employee
        String firstName = "Johny";
        String lastName = "Smith";
        int employeeId = 123;

        System.out.println("Our employee " + firstName + " " + lastName + " has id:" + employeeId);


        //About account
        String accountNumber = "PL0001444872999";
        String currencyCode = "PLN";
        long amountMultiplied100 = 200000;

        System.out.println(accountNumber + " has " + amountMultiplied100/100 + currencyCode);
    }
}