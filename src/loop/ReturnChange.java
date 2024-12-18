package loop;

import java.util.Scanner;

public class ReturnChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào giá bán sản phẩm: ");
        int price = sc.nextInt();
        System.out.print("Nhập số tiền khách trả: ");
        int money = sc.nextInt();

        int change = money - price;

        int[] denominations = {500000, 200000, 100000, 50000, 20000, 10000, 5000, 2000, 1000};
        int[] counts = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            while (change >= denominations[i]) {
                change -= denominations[i];
                counts[i]++;
            }
        }

        System.out.println("Số tờ tiền thối lại cho khách bao gồm:");
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("%d tờ %d VND\n", counts[i], denominations[i]);
            }
        }

        if (change > 0) {
            System.out.printf("Không có tờ tiền mệnh giá %d VND, tặng kẹo!\n", change);
        }
    }
}
