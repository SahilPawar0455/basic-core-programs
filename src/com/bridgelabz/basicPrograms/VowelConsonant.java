package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabetical");
        String letter = scanner.nextLine();
        switch (letter){
            case "a":
                System.out.println("This is Vowel");
                break;
            case "e":
                System.out.println("This is Vowel");
                break;
            case "i":
                System.out.println("This is Vowel");
                break;
            case "o":
                System.out.println("This is Vowel");
                break;
            case "u":
                System.out.println("This is Vowel");
                break;
            default:
                System.out.println("This is consonant");
        }
    }
}
