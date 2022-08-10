package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        double result = 0.0;
        int number = scanner.nextInt();
        for (int i = number; i > 0; i--) {
            result = result + (double) 1 / i;
            System.out.print(result + " ,");
        }
    }
}
