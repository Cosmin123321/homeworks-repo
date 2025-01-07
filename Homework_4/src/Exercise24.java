//Write a method that checks if a given year is a leap year or not.
// Use this method in the main program to check several year values.

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write how many years you want to check if are leap or not: ");
        int nrYears = sc.nextInt();

        int[] years = new int[nrYears];
        System.out.println("Enter the years: ");
        for (int i = 0 ; i <= years.length - 1 ; i++) {
            years[i] = sc.nextInt();
        }

        leapCheck(years);

    }

    public static void leapCheck(int[] arr) {

        for (int i = 0 ; i <= arr.length - 1 ; i++) {
            if (arr[i] % 4 == 0) {
                System.out.print(arr[i] + " is a leap year" + "\n");
            }
        }
    }
}
