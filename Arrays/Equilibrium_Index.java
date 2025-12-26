package shk.practice.Arrays;

public class Equilibrium_Index {

    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            totalSum -= arr[i];

            if (leftSum == totalSum) {
                System.out.println(i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println(-1);
    }
}

