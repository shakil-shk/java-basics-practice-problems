package shk.practice.Arrays;

public class Merge_Two_Sorted_Arrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 6};
        int[] arr2 = {2, 5, 7, 8};
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < m) {
            arr3[k++] = arr1[i++];
        }
        while (j < n) {
            arr3[k++] = arr2[j++];
        }
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }
}
