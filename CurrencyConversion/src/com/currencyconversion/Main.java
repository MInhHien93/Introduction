package com.currencyconversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 23000;
        System.out.print("Enter the mount of USD to convert: ");
        double usd = sc.nextDouble();
        double exchange = usd * rate;
        System.out.println("Exchange rate to VND: " + exchange);
    }
}
