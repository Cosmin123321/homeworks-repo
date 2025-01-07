//Create a basic calculator program that accepts two numbers and an operator,
// and performs the operation using a switch statement.

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0); //linie luata de pe net

        switch (op) {
            case '+' -> System.out.print(a + b);
            case '-' -> System.out.print(a - b);
            case '*' -> System.out.print(a * b);
            case '/' -> System.out.print(a / b);
            case '%' -> System.out.print(a % b);
            default -> System.out.print("Invalid operator");
        }

    }
}