package org.example;

public class Ex14 {
    public static void main(String[] args) {
        long result = sum(1000000000,2000000000,3,4);
        System.out.println("Sum is equal: " + result);
        System.out.println("Sum is equal: " + sum(1,2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static long sum(int... numbers) {
        long result = 0;
        for (int number : numbers) {
            result = result + number;
        }
        return result;
    }
}
