package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        double year = scanner.nextInt();
        if ((year % 4 == 0) || ((year % 100 != 0) && (year % 400 == 0))) {
            System.out.println("This is Leap Year");
        }else {
            System.out.println("This Is not Leap Year");
        }
    }
}
