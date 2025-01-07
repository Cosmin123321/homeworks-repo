import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int div = sc.nextInt();

        if (div % 2 == 0 && div % 3 == 0) {
            System.out.println("Divisible by both");
        } else if (div % 2 == 0 && div % 3 != 0) {
            System.out.println("Divisible only by 2");
        } else if (div % 2 != 0 && div % 3 == 0) {
            System.out.println("Divisible only by 3");
        } else {
            System.out.println("Not divisible by either 2 or 3");
        }
    }
}
