package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.printf("Now we have: %s%n", now);
        LocalDate dateIn100days = now.plusDays(100);
        System.out.printf("In 100 days we will have: %s%n", dateIn100days);

        calculateElapsedPeriod();
    }

    private static void calculateElapsedPeriod() {
        System.out.println("Please enter a date (yyyy-MM-dd):");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();

        LocalDate date = LocalDate.parse(dateString);
        LocalDate now = LocalDate.now();
        Period period = Period.between(date, now);

        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();

        System.out.printf("Since %s elapsed: %d years, %d months and %d days", date, years, months, days);
    }
}
