public class Main {
    public static void main(String[] args) {
        // Array of sales numbers that is one per day
        int[] sales = {120, 150, 200, 180, 250, 300, 220};
        int maxSales = sales[0];  // Start with the first day's sales
        int dayWithMaxSales = 0;  // Index of the first day

        // going through the sales array to find the maximum sales and the corresponding day
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];  // Update max sales
                dayWithMaxSales = i;  // Update day of the highest sales
            }
        }
        // Output the day with the highest sales
        System.out.println("The day with the highest sales is day " + (dayWithMaxSales + 1) + " with sales of $" + maxSales);
    }
}