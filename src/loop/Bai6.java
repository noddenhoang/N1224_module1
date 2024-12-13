package loop;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap n : ");
        int n = 20;
        int count = 0;
        int distance = 1;
        for (int i = 2; i <= n; i += 2) {
         if (count == distance) {
             System.out.print(-i + " ");
             count = 0;
             distance++;
         } else {
             System.out.print(i + " ");;
             count++;
         }
        }
    }
}
