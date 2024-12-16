package condition;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int month;
        boolean isLeapYear = false;
        //input year
        System.out.print("Nhập năm bạn muốn kiểm tra : ");
        year = scanner.nextInt();
        //Check year is leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
        //input month
        System.out.print("Nhập tháng bạn muốn kiểm tra : ");
        month = scanner.nextInt();
        //Check month with switch case
        System.out.println("Sử dụng switch case");
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.printf("Tháng %d của năm %d có 31 ngày\n", month, year);
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.printf("Tháng %d của năm %d có 30 ngày\n", month, year);
                break;
            }
            case 2: {
                if (isLeapYear) {
                    System.out.printf("Tháng %d của năm %d có 29 ngày\n", month, year);
                } else {
                    System.out.printf("Tháng %d của năm %d có 28 ngày\n", month, year);
                }
                break;
            }
            default: {
                System.out.println("Không có tháng nào như vậy");
            }
        }
        //Check month with if else
        System.out.println("Sử dụng if else");
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.printf("Tháng %d của năm %d có 31 ngày\n", month, year);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.printf("Tháng %d của năm %d có 30 ngày\n", month, year);
        } else {
            if (isLeapYear) {
                System.out.printf("Tháng %d của năm %d có 29 ngày\n", month, year);
            } else {
                System.out.printf("Tháng %d của năm %d có 28 ngày\n", month, year);
            }
        }
    }
}
