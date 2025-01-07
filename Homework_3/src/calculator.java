import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();

        System.out.println("\n\n" + "Addition " + addition(a, b) + '\n');
        System.out.println("Subtraction " + subtraction(a, b) + '\n');
        System.out.println("Multiplication " + multiplication(a, b) + '\n');
        System.out.println("Division " + division(a, b));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
