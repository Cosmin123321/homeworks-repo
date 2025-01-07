//Write a method that takes two integers as parameters and returns the maximum of the two.

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first parameter: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second parameter: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.print("The first parameter is the maximum " + n1);
        } else if (n1 < n2) {
            System.out.print("The second parameter is the maximum " + n2);
        } else {
            System.out.print("The parameters are equal");
        }
    }
}
