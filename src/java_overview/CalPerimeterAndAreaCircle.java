package java_overview;

import java.util.Scanner;

public class CalPerimeterAndAreaCircle {
    public static void main(String[] args) {
        //Variable declaration Scanner
        Scanner sc = new Scanner(System.in);

        //Input radius
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();

        //Calculate perimeter and area
        double peri = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        //Display perimeter and area
        System.out.println("Hinh tron co chu vi bang : " + peri + " va dien tich bang : " + area);
    }
}
