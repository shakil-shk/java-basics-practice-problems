package shk.practice.Arrays;
public class LargestElement {

    public static int findLargest(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 58, 23};

        int largest = findLargest(numbers);
        System.out.println("Largest element is: " + largest);
    }
}
