import java.util.Scanner;

public class arrstatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arr: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter the integers: ");
        for (int i = 0 ; i < n ; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = max(numbers);
        System.out.println("Max: " + max);
        int min = min(numbers);
        System.out.println("Min: " + min);
        int avg = avg(numbers);
        System.out.println("Avg: " + avg);


    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int avg(int[] array) {
        int avg = 0;
        for (int num : array) {
            avg += num;
        }
        return avg / array.length;
    }
}
