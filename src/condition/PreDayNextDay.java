package condition;

import java.util.Scanner;

public class PreDayNextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        boolean isLeapYear = false;
        //input day
        System.out.print("Nhập ngày: ");
        day = sc.nextInt();
        //check day
        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ");
            return;
        }
        //input month
        System.out.print("Nhập tháng: ");
        month = sc.nextInt();
        //check month
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ");
            return;
        }
        //check day in month
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Tháng " + month + " không có ngày 31");
                return;
            }
        }
        //input year
        System.out.print("Nhập năm: ");
        year = sc.nextInt();
        //check year
        if (year < 1) {
            System.out.println("Năm không hợp lệ");
            return;
        }
        //check leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Tháng 2 không có ngày 30");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Năm " + year + " không phải năm nhuận nên tháng 2 chỉ có 28 ngày");
                    return;
                }
            }
        }
        //Display input day
        System.out.println("Bạn đã nhập vào ngày: " + day + "/" + month + "/" + year);

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay == 31 && nextMonth < 12 || nextDay == 30 && (nextMonth == 4 || nextMonth == 6 || nextMonth == 9 || nextMonth == 11) || nextDay == 29 && nextMonth == 2 || nextDay == 28 && nextMonth == 2 && !isLeapYear) {
            nextDay = 1;
            nextMonth++;
        } else if (nextDay == 31 && nextMonth == 12) {
            nextDay = 1;
            nextMonth = 1;
            nextYear++;
        } else {
            nextDay++;
        }
        System.out.println("Ngày kế tiếp là: " + nextDay + "/" + nextMonth + "/" + nextYear);

        int preDay = day;
        int preMonth = month;
        int preYear = year;

        if (preDay == 1 && preMonth > 1) {
            preMonth--;
            if (preMonth == 4 || preMonth == 6 || preMonth == 9 || preMonth == 11) {
                preDay = 30;
            } else if (preMonth == 2) {
                if (isLeapYear) {
                    preDay = 29;
                } else {
                    preDay = 28;
                }
            } else {
                preDay = 31;
            }
        } else if (preDay == 1 && preMonth == 1) {
            preDay = 31;
            preMonth = 12;
            preYear--;
        } else {
            preDay--;
        }
        System.out.println("Ngày trước đó là: " + preDay + "/" + preMonth + "/" + preYear);
    }
}
