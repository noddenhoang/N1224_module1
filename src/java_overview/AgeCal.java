package java_overview;

import java.util.Scanner;

public class AgeCal {
    public static void main(String[] args) {
        //Nhập
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao nam sinh cua ban: ");

        int yearBirth = sc.nextInt();
        int yearNow = java.time.LocalDate.now().getYear();
        //Xuất
        System.out.println("Ban da " + (yearNow - yearBirth) + " tuoi roi");
    }
}
