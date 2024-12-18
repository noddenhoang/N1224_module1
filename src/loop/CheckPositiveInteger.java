package loop;

import java.util.Scanner;

public class CheckPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);

        boolean isPalindrome = true;
        boolean isPrime = true;
        boolean isIncreasing = true;
        //Ktr số đối xứng
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        //Ktr số nguyên tố
        if (n < 2) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        //Ktr số tăng dần
        for (int i = 0; i <= s.length() - 2; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                isIncreasing = false;
                break;
            }
        }
        String resultPalindrome = isPalindrome ? " là số đối xứng" : " không phải là số đối xứng";
        String resultPrime = isPrime ? " là số nguyên tố" : " không phải là số nguyên tố";
        String resultIncreasing = isIncreasing ? " là số tăng dần" : " không tăng dần";
        System.out.printf("%d%s \n%d%s \n%d%s", n, resultPalindrome, n, resultPrime, n, resultIncreasing);
    }
}
