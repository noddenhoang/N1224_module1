package java_overview;

import java.util.Scanner;

public class CalLicensePlateNum {
    public static void main(String[] args) {
        //Variable declaration Scanner
        Scanner sc = new Scanner(System.in);

        //Input numbers of license plate
        System.out.print("Nhap so bien so xe cua ban : ");
        int lpNums = sc.nextInt();
        int lpNumsDisplay = lpNums;

        //Calculate sum of numbers of license plate
        int sum = 0;
//        while (lpNums > 0) {
//            sum += lpNums % 10;
//            lpNums /= 10;
//        }
        sum += lpNums % 10;
        lpNums /= 10;
        sum += lpNums % 10;
        lpNums /= 10;
        sum += lpNums % 10;
        lpNums /= 10;
        sum += lpNums % 10;
        lpNums /= 10;
        sum += lpNums % 10;
        lpNums /= 10;
        sum += lpNums % 10;

        //Display score of license plate
        System.out.println("So nut cua bien so xe co so " + lpNumsDisplay + " la : " + sum % 10);
    }
}
