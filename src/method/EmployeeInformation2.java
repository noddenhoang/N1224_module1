package method;

import java.util.Scanner;

public class EmployeeInformation2 {
    static String fullName1;
    static int age1;
    static String gender1;
    static double salary1;
    static double avgScore1;
    static String fullName2;
    static int age2;
    static String gender2;
    static double salary2;
    static double avgScore2;
    static String fullName3;
    static int age3;
    static String gender3;
    static double salary3;
    static double avgScore3;
    static String fullName4;
    static int age4;
    static String gender4;
    static double salary4;
    static double avgScore4;
    static String fullName5;
    static int age5;
    static String gender5;
    static double salary5;
    static double avgScore5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập n (n <=5): ");
            n = sc.nextInt();
            if (n > 5 || n < 1) {
                System.out.println("Vui lòng nhập lại n <= 5");
            }
        } while (n > 5 || n < 1);

        switch (n) {
            case 1:
                inputEmployeeInformation1();
                outputEmployeeInformation1();
                break;
            case 2:
                inputEmployeeInformation1();
                inputEmployeeInformation2();

                outputEmployeeInformation1();
                outputEmployeeInformation2();
                break;
            case 3:
                inputEmployeeInformation1();
                inputEmployeeInformation2();
                inputEmployeeInformation3();

                outputEmployeeInformation1();
                outputEmployeeInformation2();
                outputEmployeeInformation3();
                break;
            case 4:
                inputEmployeeInformation1();
                inputEmployeeInformation2();
                inputEmployeeInformation3();
                inputEmployeeInformation4();

                outputEmployeeInformation1();
                outputEmployeeInformation2();
                outputEmployeeInformation3();
                outputEmployeeInformation4();
                break;
            case 5:
                inputEmployeeInformation1();
                inputEmployeeInformation2();
                inputEmployeeInformation3();
                inputEmployeeInformation4();
                inputEmployeeInformation5();

                outputEmployeeInformation1();
                outputEmployeeInformation2();
                outputEmployeeInformation3();
                outputEmployeeInformation4();
                outputEmployeeInformation5();
        }
    }

    public static void inputEmployeeInformation1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên thứ 1");
        System.out.print("Nhập họ tên: ");
        fullName1 = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        gender1 = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        salary1 = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            avgScore1 = Double.parseDouble(sc.nextLine());
            if (avgScore1 > 10 || avgScore1 < 0) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (avgScore1 > 10 || avgScore1 < 0);
    }

    public static void outputEmployeeInformation1() {
        System.out.println("Thông tin nhân viên thứ 1");
        System.out.println("Họ tên: " + fullName1);
        System.out.println("Tuổi: " + age1);
        System.out.println("Giới tính: " + gender1);
        System.out.println("Lương cơ bản: " + salary1);
        System.out.println("Điểm trung bình tốt nghiệp: " + avgScore1);
    }

    public static void inputEmployeeInformation2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên thứ 2");
        System.out.print("Nhập họ tên: ");
        fullName2 = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        gender2 = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        salary2 = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            avgScore2 = Double.parseDouble(sc.nextLine());
            if (avgScore2 > 10 || avgScore2 < 0) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (avgScore2 > 10 || avgScore2 < 0);
    }

    public static void outputEmployeeInformation2() {
        System.out.println("Thông tin nhân viên thứ 2");
        System.out.println("Họ tên: " + fullName2);
        System.out.println("Tuổi: " + age2);
        System.out.println("Giới tính: " + gender2);
        System.out.println("Lương cơ bản: " + salary2);
        System.out.println("Điểm trung bình tốt nghiệp: " + avgScore2);
    }

    public static void inputEmployeeInformation3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên thứ 3");
        System.out.print("Nhập họ tên: ");
        fullName3 = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age3 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        gender3 = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        salary3 = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            avgScore3 = Double.parseDouble(sc.nextLine());
            if (avgScore3 > 10 || avgScore3 < 0) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (avgScore3 > 10 || avgScore3 < 0);
    }

    public static void outputEmployeeInformation3() {
        System.out.println("Thông tin nhân viên thứ 3");
        System.out.println("Họ tên: " + fullName3);
        System.out.println("Tuổi: " + age3);
        System.out.println("Giới tính: " + gender3);
        System.out.println("Lương cơ bản: " + salary3);
        System.out.println("Điểm trung bình tốt nghiệp: " + avgScore3);
    }

    public static void inputEmployeeInformation4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên thứ 4");
        System.out.print("Nhập họ tên: ");
        fullName4 = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age4 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        gender4 = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        salary4 = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            avgScore4 = Double.parseDouble(sc.nextLine());
            if (avgScore4 > 10 || avgScore4 < 0) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (avgScore4 > 10 || avgScore4 < 0);
    }

    public static void outputEmployeeInformation4() {
        System.out.println("Thông tin nhân viên thứ 4");
        System.out.println("Họ tên: " + fullName4);
        System.out.println("Tuổi: " + age4);
        System.out.println("Giới tính: " + gender4);
        System.out.println("Lương cơ bản: " + salary4);
        System.out.println("Điểm trung bình tốt nghiệp: " + avgScore4);
    }

    public static void inputEmployeeInformation5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên thứ 5");
        System.out.print("Nhập họ tên: ");
        fullName5 = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age5 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        gender5 = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        salary5 = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            avgScore5 = Double.parseDouble(sc.nextLine());
            if (avgScore5 > 10 || avgScore5 < 0) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (avgScore5 > 10 || avgScore5 < 0);
    }

    public static void outputEmployeeInformation5() {
        System.out.println("Thông tin nhân viên thứ 5");
        System.out.println("Họ tên: " + fullName5);
        System.out.println("Tuổi: " + age5);
        System.out.println("Giới tính: " + gender5);
        System.out.println("Lương cơ bản: " + salary5);
        System.out.println("Điểm trung bình tốt nghiệp: " + avgScore5);
    }
}
