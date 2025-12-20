package Mathematics;
public class Counting_Digits {
    public static void main(String args[]) {
        int x = 123456789;
        int res = Count_digits(x); 
        System.out.println(res);
    }

    public static int Count_digits(int x) {
        int res = 0;
        while (x > 0) {
            x = x / 10;
            res++;
        }
        return res;
    }
}