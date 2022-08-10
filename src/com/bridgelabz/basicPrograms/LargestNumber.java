package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the Third Number");
        int thirdNumber = scanner.nextInt();
        if ((firstNumber>secondNumber) && (firstNumber>thirdNumber) ){
            System.out.println("Largest number is = "+firstNumber);
        } else if ((secondNumber>firstNumber)&&(secondNumber>thirdNumber)) {
            System.out.println("Largest number is = "+secondNumber);
        }else {
            System.out.println("Largest number is = "+thirdNumber);
        }
    }
}
