package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int dividend = scanner.nextInt();
        System.out.println("Enter the Divisor");
        int divisor = scanner.nextInt();
        int remainder = dividend % divisor;
        double quotiend = dividend / divisor;
        System.out.println("Quotiend is = "+quotiend);
        System.out.println("Remainder is = "+remainder);
    }
}
