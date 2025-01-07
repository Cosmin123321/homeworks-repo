//Write a program to find the largest element in an array of integers.

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0 ; i < size ; i ++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}