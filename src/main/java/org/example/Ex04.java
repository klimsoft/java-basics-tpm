package org.example;

public class Ex04 {
    public static void main(String[] args) {
        float temperature = -5;
        if (temperature < -5) {
            System.out.println("Very cold");
        } else if (temperature < 5) {
            System.out.println("Cold");
        } else if (temperature < 25) {
            System.out.println("Neutral");
        } else if (temperature < 35) {
            System.out.println("Hot");
        } else {
            System.out.println("Very hot");
        }

        if (temperature < -5) {
            System.out.println("Very cold");
        }
        if (temperature < 5 && temperature >= -5) {
            System.out.println("Cold");
        }
        if (temperature < 25 && temperature >= 5) {
            System.out.println("Neutral");
        }
        if (temperature < 35 && temperature >= 25) {
            System.out.println("Hot");
        }
        if (temperature >= 35){
            System.out.println("Very hot");
        }
    }
}
