public class SecondMinimum {
    public static void main(String[] args) {
        //an array of 10 elements
        double[] arr = {12.5, 9.2, 4.5, 19.5, 2.5, 56.8, 8.7, 6.5, 3.1, 14.3};

        double min = Double.MAX_VALUE; // first smallest element
        double secondMin = Double.MAX_VALUE; // second smallest element

        // finding the second min element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min; 
                min = arr[i]; // updating min
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i]; // updating second min
            }
        }

        // output of the second min value
        System.out.println("The second minimum value in the array is: " + secondMin);
    }
}
