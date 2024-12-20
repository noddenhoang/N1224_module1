package method;

import java.util.Scanner;

public class EmployeeInformation1 {
    static String fullName;
    static int age;
    static String gender;
    static double salary;
    static double avgScore;
    public static void main(String[] args) {
        inputEmployeeInformation();
        outputEmployeeInformation();
    }
    public static void inputEmployeeInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        fullName = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        gender = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        salary = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            avgScore = Double.parseDouble(sc.nextLine());
            if (avgScore > 10 || avgScore < 0) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        }while(avgScore > 10 || avgScore < 0);
    }

    public static void outputEmployeeInformation() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Lương cơ bản: " + salary);
        System.out.println("Điểm trung bình tốt nghiệp: " + avgScore);
    }
}
