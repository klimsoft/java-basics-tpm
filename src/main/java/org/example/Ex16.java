package org.example;

import java.util.Scanner;

public class Ex16 {
    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public boolean isWeekday() {
            return !isWeekend();
        }

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a day of the week:");
        Day day = null;
        while (day == null) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toUpperCase();
            try {
                day = Day.valueOf(input);
            } catch (IllegalArgumentException exception) {
                System.out.println("Please provide a correct day name.");
            }
        }
        if (day.isWeekend()) {
            System.out.println( day + " is a weekend.");
        }
        if (day.isWeekday()) {
            System.out.println(day + " is a weekday.");
        }
    }
}
