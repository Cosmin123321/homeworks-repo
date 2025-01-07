//Create a program that reverses a string without using the built-in reverse function.

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = sc.nextLine();

        int f = 0;
        int l = word.length() - 1;
        for (int i = word.length() - 1 ; i >= 0 ; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
