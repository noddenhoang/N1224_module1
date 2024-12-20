package method;

import java.util.Scanner;

public class MethodExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một ký tự hoa bất kỳ: ");
        char upperCase = sc.next().charAt(0);
        System.out.printf("%c sau khi chuyển sang ký tự thường là %c", upperCase, toLowerCase(upperCase));
        double a, b, c, d;
        System.out.print("\nNhập a: ");
        a = sc.nextDouble();
        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.printf("Giải phương trình %.1fx + %.1f = 0: ", a, b);
        levelOne(a, b);
        System.out.print("Nhập c: ");
        c = sc.nextDouble();
        System.out.printf("Giải phương trình %.1fx^2 + %.1fx + %.1f = 0:", a, b, c);
        levelTwo(a, b, c);
        System.out.print("Nhập d: ");
        d = sc.nextDouble();
        System.out.printf("Số nhỏ nhất trong %.1f, %.1f, %.1f, %.1f là %.1f", a, b, c, d, min(a, b, c, d));
    }

    public static char toLowerCase(char upperCase) {
        if (upperCase >= 'A' && upperCase <= 'Z') {
            upperCase += 32;
        }
        return upperCase;
    }

    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("\nPhương trình vô số nghiệm");
            } else {
                System.out.println("\nPhương trình vô nghiệm");
            }
        } else {
            double S = -b / a;
            System.out.println("\nPhương trình có nghiệm = " + S);
        }
    }

    public static void levelTwo(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("\nPhương trình vô số nghiệm");
                }
                System.out.println("\nPhương trình vô nghiệm");
            } else {
                levelOne(b, c);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("\nPhương trình vô nghiệm.");
            } else if (delta == 0) {
                System.out.printf("\nPhương trình có nghiệm kép x = %.1f", -b / (2 * a));
            } else {
                System.out.printf("\nPhương trình có 2 nghiệm phân biệt x1 = %.1f, x2 = %.1f", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    }

    public static double min(double a, double b, double c, double d) {
        a = a < b ? a : b;
        c = a < c ? a : c;
        d = a < d ? a : d;
        return d;
    }
}
