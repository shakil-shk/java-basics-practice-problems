package shk.practice.Arrays;

public class Reverse_Array{

    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Reversed array:");
        printArray(arr);
    }
}

