package condition;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap ngay : ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Chu Nhat");
//                break;
//            case 2:
//                System.out.println("Thu 2");
//                break;
//            case 3:
//                System.out.println("Thu 3");
//                break;
//            case 4:
//                System.out.println("Thu 4");
//                break;
//            case 5:
//                System.out.println("Thu 5");
//                break;
//            case 6:
//                System.out.println("Thu 6");
//                break;
//            case 7:
//                System.out.println("Thu 7");
//                break;
//            default:
//                System.out.println("Khong phai ngay trong tuan");

//        int a = 10;
//        int b = 9;
//        int max = a > b ? a : b;
//        System.out.println("So lon nhat la : " + max);

//        int n = 4;
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
        double score;
        do {
            System.out.print("Nhap vao diem cua ban : ");
            score = sc.nextDouble();
            if (score < 0 || score > 10){
                System.out.print("Diem khong hop le, vui long nhap lai. ");
            }
        }
        while (score < 0 || score > 10);
    }
}