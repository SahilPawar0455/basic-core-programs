package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number =  scanner.nextInt();
        int factors = 1;
        for (int i = 1; i <= number; i++) {
            factors = factors*i;
        }
        System.out.println("Factors of "+number+" is "+factors);
    }
}
