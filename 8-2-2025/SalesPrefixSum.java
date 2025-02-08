import java.util.Scanner;

public class SalesPrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of hours (n):");
        int n = scanner.nextInt();

        int[] sales = new int[n];

        System.out.println("Enter sales amounts for each hour:");
        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
            if (i > 0) sales[i] += sales[i - 1];  // Updating the array itself
        }

        System.out.println("PrefixSum array:");
        for (int num : sales) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}