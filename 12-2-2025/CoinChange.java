import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Initialize dp array with a large value
        dp[0] = 0; // Base case: 0 coins needed for amount 0
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of coin denominations: ");
        int n = scanner.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter the coin denominations: ");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        scanner.close();
        
        int result = minCoins(coins, amount);
        System.out.println("Minimum coins required: " + result);
    }
}
