package org.example;

import java.util.Scanner;

public class Ex15 {
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
        System.out.printf("%s is a weekday: %b %n", Day.MONDAY, Day.MONDAY.isWeekday());
        System.out.printf("%s is a weekday: %b %n", Day.WEDNESDAY, Day.WEDNESDAY.isWeekday());
        System.out.printf("%s is a weekday: %b %n", Day.FRIDAY, Day.FRIDAY.isWeekday());
        System.out.printf("%s is a weekday: %b %n", Day.SATURDAY, Day.SATURDAY.isWeekday());

        System.out.println("Enter a day of the week:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(input);
        if (day.isWeekend()) {
            System.out.println( day + " is a weekend.");
        }
        if (day.isWeekday()) {
            System.out.println(day + " is a weekday.");
        }
    }
}
