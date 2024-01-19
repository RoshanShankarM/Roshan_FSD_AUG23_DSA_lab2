package com.algorithmlab2;
import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of transaction array");
        int n = scanner.nextInt();

        System.out.println("Enter the values of array");
        int[] transactions = new int[n];
        for (int i = 0; i < n; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.println("Enter the total no of targets that need to be achieved");
        int totalTargets = scanner.nextInt();

        for (int targetCount = 1; targetCount <= totalTargets; targetCount++) {
            System.out.println("Enter the value of target");
            int target = scanner.nextInt();

            int sum = 0;
            int transactionsNeeded = 0;
            for (int i = 0; i < n; i++) {
                sum += transactions[i];
                transactionsNeeded++;

                if (sum >= target) {
                    System.out.println("Target achieved after " + transactionsNeeded + " transactions");
                    break;
                }
            }

            if (sum < target) {
                System.out.println("Given target is not achieved");
            }
        }

        scanner.close();
    }
}
