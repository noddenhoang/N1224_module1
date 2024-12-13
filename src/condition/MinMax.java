package condition;

public class MinMax {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("So lon nhat la : " + max);
        System.out.println("So nho nhat la : " + min);
    }
}