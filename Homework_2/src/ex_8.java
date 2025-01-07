import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a; int b = 0;

        while (true) {
            System.out.print("Enter an int: ");
            a = sc.nextInt();

            if (a > 0) {
                b += a;
            } else if (a < 0) {
                System.out.println("The sum of the positive ints is " + b);
                break;
            }
        }
    }
}
