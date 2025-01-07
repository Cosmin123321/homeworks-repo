//Write a method that checks if a number is prime or not.

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int prime = sc.nextInt();

        if (prime / 2 == 0) {
            System.out.print("The number " + prime + " is not prime");
        } else {
            System.out.print("The number " + prime + " is prime");
        }
    }
}
