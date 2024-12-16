package condition;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input number
        System.out.print("Nhập vào một số nguyên dương: ");
        int number = sc.nextInt();
        //check square number
        if (Math.sqrt(number) % 1 == 0) {
            System.out.println(number + " là số chính phương");
        } else {
            System.out.println(number + " không phải là số chính phương");
        }
    }
}
