import java.util.Scanner;
import java.util.Random;

public class KthClosestTemp {
    public static int quickSelect(int[] readings, int target, int k, int left, int right) {
        if (left == right) return readings[left];
        
        int pivotIndex = partition(readings, target, left, right);
        int rank = pivotIndex - left + 1;
        
        if (rank == k) return readings[pivotIndex];
        else if (rank > k) return quickSelect(readings, target, k, left, pivotIndex - 1);
        else return quickSelect(readings, target, k - rank, pivotIndex + 1, right);
    }

    private static int partition(int[] readings, int target, int left, int right) {
        int pivotIndex = new Random().nextInt(right - left + 1) + left;
        int pivotValue = readings[pivotIndex];
        swap(readings, pivotIndex, right);
        
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (Math.abs(readings[i] - target) < Math.abs(pivotValue - target)) {
                swap(readings, storeIndex, i);
                storeIndex++;
            }
        }
        swap(readings, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] readings, int i, int j) {
        int temp = readings[i];
        readings[i] = readings[j];
        readings[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sensor readings: ");
        int n = scanner.nextInt();
        int[] readings = new int[n];
        System.out.println("Enter the sensor readings: ");
        for (int i = 0; i < n; i++) {
            readings[i] = scanner.nextInt();
        }
        System.out.print("Enter the target temperature: ");
        int target = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.close();
        
        int result = quickSelect(readings, target, k, 0, n - 1);
        System.out.println("The " + k + "-th closest temperature reading is: " + result);
    }
}
