package shk.practice.Mathematics;

public class Absolute_Value {
    public static void main(String[] args) {
        int x=-69;
        Solution res = new Solution();
        System.out.println(res.absolute(x));
    }

    private static class Solution {
        public int absolute(int I) {
            return Math.abs(I);
        }
    }
}
