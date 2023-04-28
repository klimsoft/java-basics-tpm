package org.example;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("What is your birth date?");
        String birthDate = scanner.nextLine();

        System.out.printf("New employee was created. First name: %s, last name: %s, born: %s", firstName, lastName, birthDate);
    }
}
