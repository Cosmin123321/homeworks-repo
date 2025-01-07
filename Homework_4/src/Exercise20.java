//Write a recursive method to generate the Fibonacci sequence up to a given number of terms.

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many fibonacci terms you want printed: ");
        int fib = sc.nextInt();

        int firstNr = 0;
        int secondNr = 1;
        int sum = 0;

        for (int i = 0 ; i <= fib ; i++) {
            System.out.print( firstNr + " ");

            sum = firstNr + secondNr;
            firstNr = secondNr;
            secondNr = sum;
        }
    }
}
