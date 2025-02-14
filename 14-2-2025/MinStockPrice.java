import java.util.*;

public class MinStockPrice {
    public static List<Integer> minStockPrices(int[] prices, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < prices.length; i++) {
            // Remove elements out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove elements that are greater than the current element (maintain min at front)
            while (!deque.isEmpty() && prices[deque.peekLast()] > prices[i]) {
                deque.pollLast();
            }
            
            // Add current element index
            deque.offerLast(i);
            
            // Store the minimum value from the deque's front once window is fully formed
            if (i >= k - 1) {
                result.add(prices[deque.peekFirst()]);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] stockPrices = {120, 110, 115, 100, 105, 98, 102};
        int k = 3;
        List<Integer> minPrices = minStockPrices(stockPrices, k);
        System.out.println(minPrices);  // Output: [110, 100, 100, 98, 98]
    }
}
