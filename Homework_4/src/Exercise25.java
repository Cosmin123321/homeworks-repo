//Write a method that checks if a given number is a palindrome
// (e.g., 121, 12321 are palindromes).

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Is the number " + number + " a palindrome ?" + "\n");
        System.out.println(palCheck(number));


    }

    public static boolean palCheck (int x) {
        int y = 0;
        int x2 = x;

        boolean check = false;

        while (x > 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }

        if (y == x2) {
            check = true;
        } else if (y != x2) {
            check = false;
        }

        return check;
    }
}
