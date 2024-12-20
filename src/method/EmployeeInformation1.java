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
//        System.out.print("Nhập giới tính: ");
//        gender = sc.nextLine();
        int choose;
        do {
            System.out.println("Chọn giới tính của bạn");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("3. Khác");

            System.out.print("Mời bạn chọn: ");
            choose = Integer.parseInt(sc.nextLine());

            if(choose < 0 || choose > 3) {
                System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại");
            }
        }while(choose < 0 || choose > 3);
        if (choose == 1) {
            gender = "Nam";
        }else if (choose == 2) {
            gender = "Nữ";
        }else{
            gender = "Khác";
        }
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
        System.out.println("Giới tính: " + gender );
        System.out.println("Lương cơ bản: " + salary);
        System.out.println("Điểm trung bình tốt nghiệp: " + avgScore);
    }
}
