public class RemoveDuplicates
 {
    public static void main(String[] args) {
        String input = "banana";
        System.out.println(removeDuplicates(input, "", 0));
    }

    public static String removeDuplicates(String str, String result, int index) {
        if (index == str.length()) return result; // Base case

        char currentChar = str.charAt(index);
        if (result.indexOf(currentChar) == -1) { // If character is not already added
            result += currentChar;
        }

        return removeDuplicates(str, result, index + 1); // Recursive call
    }
}