package shk.practice.Mathematics;

public class Factorial_Number {
    public static void main(String[] args) {
      int n = 5;
      System.out.println(fact(n));
    }
    public static int fact(int n) {     // iterative method written by (SHAKIL)
            int res=1;
            for(int i=2;i<=n;i++){
                res*=i;
            }
            return res;
        }
    }
                 //This code is for recursive method

    public static int fact(int n) {      //Recursive method written by (SHAKIL)
       if (n==0)
           return 1;
       else
           return n * fact(n-1);
    }

