package java_overview;

public class CalAIJ {
    public static void main(String[] args) {
        System.out.println("Voi i = 1; j = 1; a = 1");

        //A
        int i = 1, j = 1;
        int a = i++ + j++;
        System.out.println("a. Khi tinh a = i++ + j++ thi gia tri cac so lan luot se la :  i = " + i + ", j = " + j + ", a = " + a);

        //B
        i = 1; j = 1; a = 1;
        a = i++ + ++j;
        System.out.println("b. Khi tinh a = i++ + ++j thi gia tri cac so lan luot se la :  i = " + i + ", j = " + j + ", a = " + a);

        //C
        i = 1; j = 1; a = 1;
        a = ++i + j++;
        System.out.println("c. Khi tinh a = ++i + j++; thi gia tri cac so lan luot se la :  i = " + i + ", j = " + j + ", a = " + a);

        //D
        i = 1; j = 1; a = 1;
        a = ++i + ++j;
        System.out.println("d. Khi tinh a = ++i + ++j thi gia tri cac so lan luot se la :  i = " + i + ", j = " + j + ", a = " + a);

        //E
        i = 1; j = 1; a = 1;
        a = i++ + j++ + i++ + j++;
        System.out.println("e. Khi tinh a = i++ + j++ + i++ + j++ thi gia tri cac so lan luot se la :  i = " + i + ", j = " + j + ", a = " + a);

        //F
        i = 1; j = 1; a = 1;
        a = ++i + ++j + i++ + j++;
        System.out.println("f. Khi tinh a = i++ + ++j thi gia tri cac so lan luot se la :  i = " + i + ", j = " + j + ", a = " + a);

        //G
        i = 1; a = 0;
        a = i++ + ++i - i-- - --i;
        System.out.println("g. Voi i = 1; a = 0 khi tinh a = i++ + ++i - i-- - --i thi gia tri cac so lan luot se la :  i = " + i + ", a = " + a);

        //H
        a = 10;
        a += a++ + ++a;
        System.out.println("h. Voi a = 10 khi tinh a += a++ + ++a thi gia tri a = " + a);
    }
}
