package java_overview;

import java.util.Scanner;

public class AvgScoreCal {
    public static void main(String[] args) {
        //Variable declaration Scanner
        Scanner sc = new Scanner(System.in);

        //Input Math score and Math score coefficient
        System.out.print("Nhap diem toan cua ban: ");
        double mathScore = sc.nextDouble();
        System.out.print("Nhap he so diem toan cua ban: ");
        int mathSC = sc.nextInt();
        //Input Physics score and Physics score coefficient
        System.out.print("Nhap diem ly cua ban: ");
        double physicsScore = sc.nextDouble();
        System.out.print("Nhap he so diem ly cua ban: ");
        int physicsSC = sc.nextInt();
        //Input Chemistry score and Chemistry score coefficient
        System.out.print("Nhap diem hoa cua ban: ");
        double chemistryScore = sc.nextDouble();
        System.out.print("Nhap he so diem hoa cua ban: ");
        int chemistrySC = sc.nextInt();

        //Calculate AvgScore
        double avgScore = (mathScore * mathSC + physicsScore * physicsSC + chemistryScore * chemistrySC) / (chemistrySC + mathSC + physicsSC);

        //Display the AvgScore
        System.out.println("Diem trung binh 3 mon toan, ly, hoa cua ban la " + avgScore);
    }
}
