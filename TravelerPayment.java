package com.algorithmlab2;
import java.util.Arrays;
import java.util.Scanner;

public class TravelerPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations");
        int n = scanner.nextInt();

        System.out.println("Enter the currency denominations value");
        int[] denominations = new int[n];
        for (int i = 0; i < n; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount ");
        int amount = scanner.nextInt();

        Arrays.sort(denominations);
        int notesNeeded = 0;

        for (int i = n - 1; i >= 0; i--) {
            int count = amount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + ":" + count);
                notesNeeded += count;
                amount -= count * denominations[i];
            }
        }

        System.out.println("Total notes : " + notesNeeded);

        scanner.close();
    }
}
