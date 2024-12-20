package string;

import java.util.Scanner;


public class StringExercise4 {
    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ 1: ");
        str1 = sc.nextLine();
        System.out.print("Nhập chuỗi thứ 2: ");
        str2 = sc.nextLine();
        int a = str1.compareTo(str2);
        if (a < 0) {
            System.out.println(str1 + " < " + str2);
        } else if (a == 0) {
            System.out.println(str1 + " = " + str2);
        } else {
            System.out.println(str1 + " > " + str2);
        }
    }
}
