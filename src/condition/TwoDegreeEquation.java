package condition;

import java.util.Scanner;

public class TwoDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        double a = sc.nextDouble();
        System.out.println("Nhap b : ");
        double b = sc.nextDouble();
        System.out.println("Nhap c : ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2);
        }
    }
}
