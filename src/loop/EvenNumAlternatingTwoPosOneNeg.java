package loop;

import java.util.Scanner;

public class EvenNumAlternatingTwoPosOneNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        System.out.print("Cach 1: ");
        for (int i =2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nCach 2: ");
        int cout = 0;
        for (int i = 2; i <= n; i += 2) {
            cout++;
            if (cout % 3 == 0){
                System.out.print(-i + " ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
