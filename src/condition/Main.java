package condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao diem cua ban : ");
        double score = sc.nextDouble();
        if (score < 0 || score > 10) {
            System.out.println("Diem khong hop le");
        } else if (score < 5) {
            System.out.println("Yeu");
        } else if (score < 6.5) {
            System.out.println("Trung binh");
        } else if (score < 8) {
            System.out.println("Kha");
        } else{
            System.out.println("Gioi");
        }
    }
}