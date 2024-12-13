package condition;

import java.util.Scanner;

public class TranslateNumberToEnglish {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so tu 1 -> 10 : ");
        int number = sc.nextInt();
        //If-Else
        if (number == 1) {
            System.out.printf("Dich theo cach dung If-Else %d la One", number);
        } else if (number == 2) {
            System.out.printf("Dich theo cach dung If-Else %d la Two", number);
        } else if (number == 3) {
            System.out.printf("Dich theo cach dung If-Else %d la Three", number);
        } else if (number == 4) {
            System.out.printf("Dich theo cach dung If-Else %d la Four", number);
        } else if (number == 5) {
            System.out.printf("Dich theo cach dung If-Else %d la Five", number);
        } else if (number == 6) {
            System.out.printf("Dich theo cach dung If-Else %d la Six", number);
        } else if (number == 7) {
            System.out.printf("Dich theo cach dung If-Else %d la Seven", number);
        } else if (number == 8) {
            System.out.printf("Dich theo cach dung If-Else %d la Eight", number);
        } else if (number == 9) {
            System.out.printf("Dich theo cach dung If-Else %d la Nine", number);
        } else if (number == 10) {
            System.out.printf("Dich theo cach dung If-Else %d la Ten", number);
        } else {
            System.out.println("So khong hop le");
        }
        //Switch-Case
        switch (number) {
            case 1:
                System.out.printf("\nDich theo cach dung Switch-Case %d la One", number);
                break;
            case 2:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Two", number);
                break;
            case 3:
                System.out.printf("\n theo cach dung Switch-Case %d la Three", number);
                break;
            case 4:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Four", number);
                break;
            case 5:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Five", number);
                break;
            case 6:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Six", number);
                break;
            case 7:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Seven", number);
                break;
            case 8:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Eight", number);
                break;
            case 9:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Nine", number);
                break;
            case 10:
                System.out.printf("\nDich theo cach dung Switch-Case %d la Ten", number);
                break;
            default:
                System.out.println("\nSo khong hop le");
        }
    }
}
