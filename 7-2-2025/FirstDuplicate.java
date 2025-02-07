import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        // Input 10 elements to the array
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        // variable to store first duplicate
        int firstDuplicate = -1; // -1 indicates no duplicate found
        // Check for the first duplicate
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[i] == array[j]) {
                    firstDuplicate = array[i];
                    break; // exit the inner loop once the first duplicate is found
                }
            }
            if (firstDuplicate != -1) {
                break; // exit the outer loop if a duplicate has been found
            }
        }
        // output of the result
        if (firstDuplicate != -1) {
            System.out.println("The first duplicate element is: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
        scanner.close();
    }
}