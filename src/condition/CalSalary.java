package condition;

import java.util.Scanner;

public class CalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearWork;
        double basicSalary = 650000;
        //Input year work
        do {
            System.out.print("Nhập vào số năm bạn đã làm ở công ty: ");
            yearWork = sc.nextInt();
            if (yearWork <= 0) {
                System.out.println("Số năm không hợp lệ! Vui lòng nhập lại.");
            }
        }
        while (yearWork <= 0);
        //Calculator salary
        if (yearWork < 12) {
            System.out.println("Lương của bạn là : " + basicSalary * 1.92);
        } else if (yearWork < 36) {
            System.out.println("Lương của bạn là : " + basicSalary * 2.34);
        } else if (yearWork < 60) {
            System.out.println("Lương của bạn là : " + basicSalary * 3);
        } else {
            System.out.println("Lương của bạn là : " + basicSalary * 4.5);
        }
    }
}
