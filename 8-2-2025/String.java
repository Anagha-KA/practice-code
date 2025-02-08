import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Check if str2 is a substring of str1
        boolean result = isSubstring(str1, str2);

        // Output 
        if (result) {
            System.out.println("Yes, '" + str2 + "' is a substring of '" + str1 + "'.");
        } else {
            System.out.println("No, '" + str2 + "' is not a substring of '" + str1 + "'.");
        }

        scanner.close();
    }
    // Custom function to check if str2 is a substring of str1
    private static boolean isSubstring(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // If the second string is longer than the first, it's not a substring
        if (len2 > len1) return false;

        // Check every possible starting position in str1
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            // Compare each character of str2 with the corresponding part of str1
            for (j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break; 
                }
            }
            // If we successfully checked all characters of str2, return true
            if (j == len2) {
                return true;
            }
        }

        return false;d
    }
}
