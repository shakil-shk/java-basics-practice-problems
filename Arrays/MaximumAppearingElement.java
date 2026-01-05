package shk.practice.Arrays;

public class MaximumAppearingElement {
    static int findMaxAppearing(int[] L, int[] R) {

        int[] freq = new int[1000001];
        for (int i = 0; i < L.length; i++) {
            for (int j = L[i]; j <= R[i]; j++) {
                freq[j]++;
            }
        }

        int max = 0;
        int result = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] L = {1, 4, 3, 1};
        int[] R = {15, 8, 5, 4};
        System.out.println(findMaxAppearing(L, R));
    }
}

