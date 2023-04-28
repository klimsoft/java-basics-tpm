package org.example;

import java.util.Scanner;

public class Ex08RegExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide new password:");
        String newPassword = scanner.nextLine();

        boolean success = true;
        String errorMessages = "";

        if (newPassword.length() < 8) {
            errorMessages += "- Password should be at least 8 characters long\n";
            success = false;
        }
        if (!newPassword.matches(".*[a-z].*")) {
            errorMessages += "- Password should contain at least one lowercase letter\n";
            success = false;
        }
        if (!newPassword.matches(".*[A-Z].*")) {
            errorMessages += "- Password should contain at least one uppercase letter\n";
            success = false;
        }
        if (!newPassword.matches(".*\\d.*")) {
            errorMessages += "- Password should contain at least one digit";
            success = false;
        }

        if (success) {
            System.out.println("Password changed.");
        } else {
            System.out.println("Try again:");
            System.out.println(errorMessages);
        }
    }
}
