public class DebitCount {
    public static void main(String[] args) {
        int[] transactions = {900, 1500, 600, 1200, 400}; // Example transaction values
        int debitCount = 0;

        for (int transaction : transactions) {
            if (transaction < 1000) { // Assuming transactions below 1000 are debits
                debitCount++; //incrementing the debit count
            }
        }

        System.out.println("Number of debit transactions: " + debitCount);
    }
}