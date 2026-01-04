package shk.practice.Arrays;

public class PrefixSumArray {
    static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    static int getSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        } else {
            return prefixSum[R] - prefixSum[L - 1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int[] prefixSum = buildPrefixSum(arr);

        System.out.print("Prefix Sum Array: ");
        for (int value : prefixSum) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Sum from index 0 to 2: " + getSum(prefixSum, 0, 2));
        System.out.println("Sum from index 1 to 3: " + getSum(prefixSum, 1, 3));
        System.out.println("Sum from index 2 to 6: " + getSum(prefixSum, 2, 6));
    }
}

