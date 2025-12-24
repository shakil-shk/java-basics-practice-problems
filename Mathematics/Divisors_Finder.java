package shk.practice.Mathematics;

import java.util.*;

public class Divisors_Finder {
    public static List<Integer> findAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        List<Integer> divisors = findAllDivisors(num);
        System.out.println("Divisors of " + num + ": " + divisors);
        sc.close();
    }
}

