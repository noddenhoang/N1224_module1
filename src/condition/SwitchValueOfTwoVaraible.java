package condition;

public class SwitchValueOfTwoVaraible {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Su dung bien tam a = " + a);
        System.out.println("Su dung bien tam b = " + b);

        a = 1;
        b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Su dung khong su dung bien tam a = " + a);
        System.out.println("Su dung khong su dung bien tam b = " + b);
    }
}
