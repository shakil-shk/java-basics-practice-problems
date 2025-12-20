package shk.practice.Mathematics;

public class Palindrome_Number {
    public static void main(String[] args) {
    int n = 121121;
    isPalindromecheck ispal = new isPalindromecheck();
    System.out.println(ispal.isPalindrome(n));
    }

    public static class isPalindromecheck {
        boolean isPalindrome(int n){
            if (n < 0) return false;
            int rev = 0;
            int temp = n;
            while(temp != 0){
                int ld = temp % 10;
                rev = rev*10 + ld;
                temp = temp/10;
            }
            return (rev == n);
        }
    }
}
