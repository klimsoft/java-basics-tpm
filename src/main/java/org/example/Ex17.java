package org.example;

public class Ex17 {
    public static void main(String[] args) {
        Runnable evenPrinter = () -> {
            for( int i = 2; i <= 10; i+=2) {
                System.out.println("Even: " + i);
            }
        };
        Runnable oddPrinter = () -> {
            for( int i = 1; i <= 9; i+=2) {
                System.out.println("Odd: " + i);
            }
        };
        Thread t1 = new Thread(evenPrinter);
        Thread t2 = new Thread(oddPrinter);

        t1.start();
        t2.start();
    }
}
