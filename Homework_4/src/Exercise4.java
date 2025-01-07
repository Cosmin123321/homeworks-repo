//Write a program to calculate the sum of the first N natural numbers using a while loop.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0 ; i <= n ; i++) {
            sum += i;
        }
        System.out.print("The sum of the first " + n + " numbers is " + sum);
    }
}