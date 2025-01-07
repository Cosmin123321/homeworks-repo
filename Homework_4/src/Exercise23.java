//Write two methods: one that finds the minimum and another
// that finds the maximum value in an array of integers.

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] n = new int[size];

        System.out.print("Enter the " + size + " elements of the array: ");
        for (int i = 0 ; i < size ; i++) {
            n[i] = sc.nextInt();
        }

        int min = arrMin(n);
        int max = arrMax(n);
        System.out.print("The min is : " + min + "\n");
        System.out.print("The max is : " + max);

    }

    public static int arrMin(int[] arr) {
        int min = arr[0];

        for (int i = 0 ; i <= arr.length - 1 ; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int arrMax(int[] arr) {
        int max = 0;

        for (int i = 0 ; i <= arr.length - 1 ; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
