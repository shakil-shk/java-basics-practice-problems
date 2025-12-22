package shk.practice.Mathematics;

public class Trailing_Zeros_in_Factorial {
        public static int countTrailingZeros(int n) {
            int count = 0;
            for (int i = 5; n / i >= 1; i = i * 5) {
                count += n / i;
            }
            return count;
        }

        public static void main(String[] args) {
            int n = 100;
            System.out.println(countTrailingZeros(n));
        }
    }

