//Create a program that calculates the factorial of a number using a while loop.

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int fact = sc.nextInt();

        if (fact == 0 || fact == 1) {
            System.out.print(1);
        }
        int i = 1;
        int j = 1;
        while (i <= fact) {
            j *= i;
            i++;
        }
        System.out.println("The factorial of " + fact + " is " + j);
    }
}