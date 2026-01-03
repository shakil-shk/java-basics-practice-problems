package shk.practice.Arrays;

public class MoveZerosToEnd {

    static void moveZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        System.out.print("Original array: ");
        printArray(arr);

        moveZerosToEnd(arr);

        System.out.print("Modified array: ");
        printArray(arr);
    }
}

