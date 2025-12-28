package shk.practice.Arrays;

public class Largest_Sum_Subarray{

    public static void main(String[] args) {

        int[] arr = {-3, 4, -1, -2, 1, 5};
        int n = arr.length;

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < n; i++) {
            maxEndingHere += arr[i];

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        System.out.println(maxSoFar);
    }
}

