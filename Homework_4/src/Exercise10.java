//Write a program that calculates the sum of all elements in an array.

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0 ; i < size ; i ++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}