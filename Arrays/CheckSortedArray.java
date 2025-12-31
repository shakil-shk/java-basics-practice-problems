package shk.practice.Arrays;

public class CheckSortedArray {

    static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {20, 21, 45, 89, 89, 90};

        if (isSorted(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

