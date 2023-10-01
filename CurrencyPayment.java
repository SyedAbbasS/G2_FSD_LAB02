package CurrencyPayment.java;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyPayment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        int[] denominations = new int[size];

        System.out.println("Enter the currency denominations values:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        Arrays.sort(denominations); // Sort the denominations in ascending order

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        int remainingAmount = amount;
        for (int i = size - 1; i >= 0; i--) {
            int notesUsed = remainingAmount / denominations[i];
            if (notesUsed > 0) {
                System.out.println(denominations[i] + ":" + notesUsed);
                remainingAmount %= denominations[i];
            }
        }

        scanner.close();
	}

}
