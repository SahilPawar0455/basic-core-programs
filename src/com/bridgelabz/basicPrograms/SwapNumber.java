package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber = scanner.nextInt();
        int thirdNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        System.out.println("Swap the number");
        System.out.println("First number is "+firstNumber);
        System.out.println("second Number is "+secondNumber);
    }
}
