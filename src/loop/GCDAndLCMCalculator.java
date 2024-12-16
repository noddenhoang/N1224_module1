package loop;

import java.util.Scanner;

public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = sc.nextInt();

        int gcd = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        int lcm;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + gcd);
        System.out.println("Bội số chung nhỏ nhất của " + a + " và " + b + " là: " + lcm);

        sc.close();
    }
}
