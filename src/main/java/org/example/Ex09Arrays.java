package org.example;

public class Ex09Arrays {

    public static void main(String[] args) {
        //ex 1
        {
            int[] numbers = {1, 2, 3, 4, 5, 6};

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Sum of numbers is: " + sum);

            for(int number: numbers) {
                System.out.println(number);
            }

        }
        {
            String[] names = {"Johny", "Anna", "Jack", "Susan" };
            for(String name: names) {
                System.out.println(name);
            }

        }
    }
}
