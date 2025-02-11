import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr1 = {6, 8, 0, 1, 3};
        int[] arr2 = {1, 3, 2, 4};
        int[] arr3 = {10, 20, 30, 50};
        int[] arr4 = {50, 40, 30, 10};

        System.out.println(Arrays.toString(findNextGreater(arr1)));
        System.out.println(Arrays.toString(findNextGreater(arr2)));
        System.out.println(Arrays.toString(findNextGreater(arr3)));
        System.out.println(Arrays.toString(findNextGreater(arr4)));
    }

    public static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize result with -1

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break; // Found the next greater element
                }
            }
        }
        return result;
    }
}