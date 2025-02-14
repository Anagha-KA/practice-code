import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> anagramTable = new Hashtable<>();
        
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            anagramTable.putIfAbsent(sortedStr, new ArrayList<>());
            anagramTable.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(anagramTable.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}