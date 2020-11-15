package com.convertnumbertostring;

import java.util.Scanner;

public class Main {
    public static String convertFromOneToTwenty(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "ome";
            case 2:
              return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
               return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
               return "ten";
            case 11:
                return "eleven";
            case 12:
               return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
        }
        return "-1";
    }

    public static String convertFrom30To100(int number) {
        if (number % 10 == 0) {
            return convertFromOneToTwenty(10 + number/10).substring(0,convertFromOneToTwenty(10 + number / 10).length() -3) + "y";
        } else {
            return convertFromOneToTwenty(10 + number/10).substring(0,convertFromOneToTwenty(10 + number / 10).length() -3) + "y" + convertFromOneToTwenty(number % 10);

        }
    }

    public static String convertOverOneHundred(int number) {
        return convertFromOneToTwenty(number / 100) + " hundred";
    }

    public static String display(int number) {
        if (0<= number && number <= 20) {
            return convertFromOneToTwenty(number);
        } else if (number < 30) {
            return convertFromOneToTwenty(number) + convertFromOneToTwenty(number % 10);
        } else if (number < 100) {
            return  convertFrom30To100(number);
        } else {
            return convertOverOneHundred(100) + " " + display(number % 100);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println();
        System.out.println(Main.display(number));
    }
}







