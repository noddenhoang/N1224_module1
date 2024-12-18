package loop;

import java.util.Scanner;

public class SumAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("Nhập vào số a: ");
            a = sc.nextInt();
            System.out.print("Nhập vào số b: ");
            b = sc.nextInt();
            if (a > b) {
                System.out.println("Vui lòng nhập sao cho a < b!");
            }
        }
        while (a > b);
        int totalPalindrome = 0, totalPrime = 0, totalSquare = 0, countPalindrome = 0, countPrime = 0, countSquare = 0;

        for (int n = a; n <= b; n++) {
            String s = Integer.toString(n);
            boolean isPalindrome = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                totalPalindrome += n;
                countPalindrome++;
            }

            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                totalPrime++;
                totalPrime += n;
            }

            boolean isSquare = true;
            if (Math.sqrt(n) % 1 != 0) {
                isSquare = false;
            }
            if (isSquare) {
                totalSquare += n;
                countSquare++;
            }
        }

        System.out.printf("Trong khoản [%d,%d] có %d số đối xứng, %d số nguyên tố và %d số chính phương.\n", a, b, countPalindrome, countPrime, countSquare);
        System.out.printf("Tổng của các số đối xứng = %d\nTổng các số chính nguyên tố = %d\nTổng các số chính phương = %d", totalPalindrome, totalPrime, totalSquare);
    }
}
