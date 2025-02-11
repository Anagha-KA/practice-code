import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "what the what";
        System.out.println(countWords(input));
    }

    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = str.split(" ");
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        return wordCount;
    }
} 