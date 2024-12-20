package string;

import java.util.Scanner;

public class StringExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello World";
        System.out.println(str1.substring(6));
        int count = 0;
        System.out.println(str1.replace('l', 'f'));
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.printf("Có %d chữ 'l' trong chuỗi '%s'", count, str1);
        System.out.printf("\nChữ 'l' trong chuỗi '%s' xuất hiện đầu tiên ở vị trí thứ %d và cuối cùng ở vị trí thứ %d.)", str1, str1.indexOf('l'), str1.lastIndexOf('l'));
        System.out.println("\n" + str1.replace(" ", ""));
        System.out.println(str1.trim());
        StringBuilder str2 = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2.append(str1.charAt(i));
        }
        System.out.println(str2);
        System.out.println("SQC ".concat(str1));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        int n,m;
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        System.out.print("Nhập m: ");
        m = sc.nextInt();
        System.out.println(str1.substring(n,m));
    }
}
