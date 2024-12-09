package ss3_java_overview;

import java.util.Scanner;

public class CalAB {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        //Nhập a
        System.out.print("Nhap vao so a : ");
        a = sc.nextInt();
        //Nhập b
        System.out.print("Nhap vao so b : ");
        b = sc.nextInt();
        //In ra màn hình
        System.out.println("Tong cua " + a + " va " + b + " la: " + (a+b));
        System.out.println("Hieu cua " + a + " va " + b + " la: " + (a-b));
        System.out.println("Tich cua " + a + " va " + b + " la: " + (a*b));
        System.out.println("Thuong cua " + a + " va " + b + " la: " + ((float)a/b));
    }
}
