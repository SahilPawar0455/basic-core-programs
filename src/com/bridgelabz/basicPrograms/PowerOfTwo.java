package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        int result = 1;
        if (number >= 31) {
            System.out.println("Only provides less than 31");
        } else {
            for (int i = 1; i <= number; i++) {
                result = 2 * result;
            }
            System.out.println("Power of two is = " + result);
        }
    }
}
