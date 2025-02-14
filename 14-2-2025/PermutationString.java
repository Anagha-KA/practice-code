import java.util.Scanner;

public class PermutationInString {
    public static boolean isPermutationPresent(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;

        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c - 'a']++;

        int left = 0, right = 0, required = n;

        while (right < m) {
            if (count[s2.charAt(right++) - 'a']-- > 0) required--;

            if (required == 0) return true;

            if (right - left == n && count[s2.charAt(left++) - 'a']++ >= 0) required++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter s2: ");
        String s2 = scanner.nextLine();

        scanner.close();

        System.out.println("Input: s1 = \"" + s1 + "\", s2 = \"" + s2 + "\"");
        System.out.println("Output: " + isPermutationPresent(s1, s2));
    }
}
