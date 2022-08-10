package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("This is Even Number");
        } else {
            System.out.println("This is Odd Number");
        }
    }
}
