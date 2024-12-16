package loop;

import java.util.Scanner;

public class DigitSumAndProductCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập m: ");
        int m = sc.nextInt();

        int s = 0;
        int p = 1;

        while (m > 0) {
            int digit = m % 10;
            s += digit;
            p *= digit;
            m /= 10;
        }

        System.out.println("Tổng các chữ số: " + s);
        System.out.println("Tích các chữ số: " + p);
    }
}
