package com.bmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height, bmi;
        System.out.println("Enter a width:");
        width = sc.nextDouble();
        System.out.println("Enter a height:");
        height = sc.nextDouble();
        bmi = width / Math.pow(height, 2);
        System.out.printf("%-20s%s", "BMI", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");

        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");

        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
