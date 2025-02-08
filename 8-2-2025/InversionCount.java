import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " processing times:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The inversion count is " + mergeSort(arr, 0, n - 1, new int[n]));
        
        scanner.close();
    }

    // Merge Sort to count inversions
    private static int mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left >= right) return 0;

        int mid = (left + right) / 2;
        int count = mergeSort(arr, left, mid, temp) + mergeSort(arr, mid + 1, right, temp);
        count += merge(arr, left, mid, right, temp);

        return count;
    }

    // Merge and count inversions
    private static int merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left, j = mid + 1, k = left, count = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, left, arr, left, right - left + 1);

        return count;
    }
}
