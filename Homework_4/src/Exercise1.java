//Write a program that checks if a given integer is even or odd using an if statement.

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.print("The number is even ");
        } else {
            System.out.print("The number is odd ");
        }
    }
}
