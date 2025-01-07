import java.util.Scanner;

public class PrimeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m = PrimeNumbers(n);

        System.out.println("\nThere are " + m + " prime numbers until " + n);
    }


    public static int PrimeNumbers (int n) {
        int pCounter = 0;

        for (int i = 2 ; i < n ; i++) {
            if (PrimeCheck(i)) {
                pCounter++;
            }
        }
        return pCounter;
    }

    public static boolean PrimeCheck(int n) {
        if (n == 2 || n == 3) {
            return true;
        }

        if (n <= 1 || n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5 ; i * i < n ; i += 6) { //0 and 1 are not prime
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
