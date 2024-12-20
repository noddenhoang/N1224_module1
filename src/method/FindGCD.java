package method;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        System.out.printf("Ước chung lớn nhất của 2 số %d và %d là %d", a, b, GCD(a, b));
    }

    public static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int min = Math.min(a, b);
        if (Math.max(a, b) % min == 0) {
            return min;
        }
        for (int i = min / 2; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
