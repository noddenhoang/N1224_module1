package ss3_java_overview;

import java.util.Scanner;

public class CalAB {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a : ");
        a = sc.nextInt();
        System.out.print("Nhap vao so b : ");
        b = sc.nextInt();
        System.out.println("Tong cua " + a + " va " + b + " la: " + (a+b));
        System.out.println("Hieu cua " + a + " va " + b + " la: " + (a-b));
        System.out.println("Tich cua " + a + " va " + b + " la: " + (a*b));
        System.out.println("Thuong cua " + a + " va " + b + " la: " + ((float)a/b));
    }
}
