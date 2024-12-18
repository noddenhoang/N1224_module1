package loop;

public class NumberConditionChecker {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int temp1 = i % 10;
            int temp2 = i / 10;
            if (temp1 * temp2 == (temp1 + temp2) * 2) {
                System.out.print(i + " ");
            }
        }
    }
}
