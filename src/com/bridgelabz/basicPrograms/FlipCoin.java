package com.bridgelabz.basicPrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of time to flip the coin");
        int number = scanner.nextInt();
        int head = 0;
        for (int i = 1; i < number; i++) {
            double random = Math.random();
            if (random < 0.5) {
                head++;
            }
        }
        int headPercentage = (head * 100) / number;
        System.out.println("Percentage of Head = " + headPercentage);
        System.out.println("Percentage of tail = " + (100 - headPercentage));
    }
}
