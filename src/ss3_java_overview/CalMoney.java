package ss3_java_overview;

import java.util.Scanner;

public class CalMoney {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");

        String nameSp = sc.nextLine();
        System.out.print("Nhap don gia: ");

        double money = sc.nextDouble();
        System.out.print("Nhap so luong san pham: ");

        int num = sc.nextInt();
        double total = money * num;

        System.out.println("So tien phai tra cho mat hang " + nameSp + " voi so luong " + num + " = " + total);
        System.out.println("Thue gia tri gia tang = " + (total * 0.1));
    }
}
