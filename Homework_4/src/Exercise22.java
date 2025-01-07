//Write a method that takes an integer array as input and
// returns a new array with the elements reversed.

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] n = new int[size];

        System.out.print("Enter the " + size + " elements of the array: ");
        for (int i = 0 ; i < size ; i++) {
            n[i] = sc.nextInt();
        }

        int[] nRev = revArr(n);

        for(int i : nRev) {
            System.out.print(i + " ");
        }
    }

    public static int[] revArr(int[] arr) {
        int[] reverse = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }

        return reverse;
    }
}
