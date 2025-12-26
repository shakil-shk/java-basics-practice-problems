package shk.practice.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {

        int[] arr = {4, 5, 3, 2, 5};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int q = 3;
        int[][] queries = {
                {0, 3},
                {2, 4},
                {1, 3}
        };

        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int sum;
            if (l == 0) {
                sum = prefix[r];
            } else {
                sum = prefix[r] - prefix[l - 1];
            }
            System.out.println(sum);
        }
    }
}

