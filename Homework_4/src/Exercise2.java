//Write a program that takes three numbers as
// input and prints the largest number using nested if statements.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print(a + " is the largest number (1st)");
        } else if (b > a && b > c) {
            System.out.print(b + " is the largest number (2nd)");
        } else if (c > a && c > b) {
            System.out.print(c + " is the largest number (3rd)");
        } else {
            System.out.print("The numbers are equal");
        }
    }
}
