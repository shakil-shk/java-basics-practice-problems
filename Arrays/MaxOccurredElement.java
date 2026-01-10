package shk.practice.Arrays;

public class MaxOccurredElement {
    public static void main(String[] args) {
        int[] L = {1, 4, 3, 1};
        int[] R = {15, 8, 5, 4};
        int[] count = new int[1000002];

        for (int i = 0; i < L.length; i++) {
            count[L[i]]++;
            count[R[i] + 1]--;
        }

        int maxOccurrences = count[0];
        int resultElement = 0;

        for (int i = 1; i < 1000001; i++) {
            count[i] += count[i - 1];

            if (count[i] > maxOccurrences) {
                maxOccurrences = count[i];
                resultElement = i;
            }
        }
        System.out.println("Maximum Occurring Element: " + resultElement);
    }
}