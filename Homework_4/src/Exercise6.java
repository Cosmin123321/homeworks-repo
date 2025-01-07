//Write a program that reverses the digits of an integer using a do-while loop.

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want to reverse: ");
        int rev = sc.nextInt();

        if (rev <= 9 && rev >= 0) {
            System.out.print(rev);
        }

        do {
            System.out.print(rev % 10);
            rev /= 10;
        } while (rev > 0);
    }
}