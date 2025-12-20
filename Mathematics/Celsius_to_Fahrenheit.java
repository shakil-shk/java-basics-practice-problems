package shk.practice.Mathematics;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        int C=32;
        Solution res = new Solution();
        System.out.println(res.cToF(C));
    }
   public static class Solution
    {
        public double cToF(int C)
        {
            double store = (C * 9.0/5.0) + 32.0;
            return store;
        }

    }
}
