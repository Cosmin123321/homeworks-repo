//Copy the elements of one array into another array.

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //arr2 = arr; ?

        for (int i = 0 ; i < size ; i++) {
            arr2[i] = arr[i];
        }
    }
}