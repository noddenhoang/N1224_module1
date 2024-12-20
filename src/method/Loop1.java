package method;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("Số sau khi nghịch đảo: " + ReverseNumber(n));
        String result1 = Symmetrical(n) ? " là số đối xứng" : " không phải là số đối xứng";
        String result2 = isSquare(n) ? " là số số chính phương" : " không phải là số số chính phương";
        String result3 = isPrime(n) ? " là số số nguyên tố" : " không phải là số số nguyên tố";
        System.out.println(n + result1);
        System.out.println(n + result2);
        System.out.println(n + result3);
        System.out.printf("Tổng các số chính phương = %d", tongSoChinhPhuong(n));
        System.out.printf("\nTổng các số lẽ = %d", tongSoLe(n));
        System.out.printf("\nTổng các số nguyên tố = %d", tongSoNguyenTo(n));
    }

    public static int ReverseNumber(int n) {
        int temp = 0;
        while (n != 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        return temp;
    }

    public static boolean Symmetrical(int n) {
        return ReverseNumber(n) == n;
    }

    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static int tongSoChinhPhuong(int n) {
        int tong = 0;
        while (n != 0){
            int doVi = n %10;
            if (isSquare(doVi)){
                tong+=doVi;
            }
            n /= 10;
        }
        return tong;
    }
    public static int tongSoLe(int n) {
        int tong = 0;
        while (n != 0){
            int doVi = n %10;
            if (doVi % 2 != 0){
                tong+=doVi;
            }
            n /= 10;
        }
        return tong;
    }
    public static boolean isPrime(int n) {
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int tongSoNguyenTo(int n) {
        int tong = 0;
        while (n != 0){
            int doVi = n %10;
            if (isPrime(doVi)){
                tong+=doVi;
            }
            n /= 10;
        }
        return tong;
    }
}
