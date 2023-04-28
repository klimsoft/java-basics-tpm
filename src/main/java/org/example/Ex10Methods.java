package org.example;

import java.util.Arrays;

public class Ex10Methods {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4};
        int min = findMin(numbers);
        int max = findMax(numbers);
        int sum = calculateSum(numbers);
        double avg = calculateAverage(numbers);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of values: " + sum);
        System.out.println("Average value: " + avg);

    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i:numbers) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i:numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i:numbers) {
            sum += i;
        }
        return sum;
    }

    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        double avg = (double) sum / numbers.length;
        return avg;
    }


}
