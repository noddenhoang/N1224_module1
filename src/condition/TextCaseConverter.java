package condition;

import java.util.Scanner;

public class TextCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character;
        System.out.print("Nhập ký tự bạn muốn chuyển đổi : ");
        character = sc.next().charAt(0);
        //check character
        if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
            if (character >= 'A' && character <= 'Z') {
                System.out.printf("Ký tự %c chuyển sang ký tự thường là %c\n", character, character + 32);
            } else{
                System.out.printf("Ký tự %c chuyển sang ký tự hoa là %c\n", character, character - 32);
            }
        }
        else {
            System.out.println("Ký tự bạn nhập không phải là chữ cái");
        }
    }
}
