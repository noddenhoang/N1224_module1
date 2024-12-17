package loop;

import java.util.Scanner;

public class ConvertToBinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        String binary = " ";
        while (n > 0) {
            binary = n % 2 + binary;
            n /= 2;
        }
        System.out.println(binary);
        sc.close();
    }
}
