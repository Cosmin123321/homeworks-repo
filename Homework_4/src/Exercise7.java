//Declare an array of integers and print all its elements using the enhanced for loop.

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < size ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}