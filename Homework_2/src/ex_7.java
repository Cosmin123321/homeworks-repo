import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int pos = sc.nextInt();

        int fact = 1;
        int h = 1;

        if (pos == 0)
            System.out.println("1");
        while(true) {
            fact *= h;
            h++; pos--;
            if (pos == 0) {
                System.out.print("The factorial is: " + fact);
                break;
            }
        }
    }
}
