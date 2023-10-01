package PayMoneyTransactions.java;

import java.util.Scanner;

public class PayMoneyTransactions {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Test Case 1");
	        solveTestCase(scanner);

	        System.out.println("\nTest Case 2");
	        solveTestCase(scanner);

	        scanner.close();

	}
	 public static void solveTestCase(Scanner scanner) {
	        System.out.print("Enter the size of the transaction array: ");
	        int size = scanner.nextInt();
	        int[] transactions = new int[size];

	        System.out.println("Enter the values of the array:");
	        for (int i = 0; i < size; i++) {
	            transactions[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the total number of targets that need to be achieved: ");
	        int numTargets = scanner.nextInt();

	        for (int t = 0; t < numTargets; t++) {
	            System.out.print("Enter the value of the target: ");
	            int target = scanner.nextInt();

	            int total = 0;
	            int transactionsNeeded = 0;

	            for (int i = 0; i < size; i++) {
	                total += transactions[i];
	                transactionsNeeded++;

	                if (total >= target) {
	                    break;
	                }
	            }

	            if (total >= target) {
	                System.out.println("Target achieved after " + transactionsNeeded + " transactions");
	            } else {
	                System.out.println("Given target is not achieved");
	            }
	        }
	    }

}
