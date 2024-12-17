package loop;

import java.util.Scanner;

public class CheckPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(n + " là số đối xứng");
        } else {
            System.out.println(n + " không đối xứng");
        }
    }
}
