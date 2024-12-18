package loop;

import java.util.Scanner;

public class CalFactorial3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int facta = 1, factb = 1, factc = 1;
        do {
            System.out.print("Nhập vào số a: ");
            a = sc.nextInt();
            if (a < 1){
                System.out.println("Vui lòng nhập lại a!");
            }
        }
        while(a < 1);

        do {
            System.out.print("Nhập vào số b: ");
            b = sc.nextInt();
            if (b < 1){
                System.out.println("Vui lòng nhập lại b!");
            }
        }
        while(b < 1);

        do {
            System.out.print("Nhập vào số c: ");
            c = sc.nextInt();
            if (c < 1){
                System.out.println("Vui lòng nhập lại c!");
            }
        }
        while(c < 1);

        for (int i = 1; i <= a; i++){
            facta = facta * i;
        }
        for (int i = 1; i <= b; i++){
            factb = factb * i;
        }
        for (int i = 1; i <= c; i++){
            factc = factc * i;
        }

        int fact = facta + factb + factc;
        System.out.printf("%d! + %d! + %d! = %d", a, b, c, fact);
    }
}
