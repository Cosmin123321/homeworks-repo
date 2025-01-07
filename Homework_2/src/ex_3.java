import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number ");
        int nr1 = sc.nextInt();
        System.out.print("Enter the second number ");
        int nr2 = sc.nextInt();
        System.out.print("Enter the operator ");
        String op = sc.next();

        double outp = 0;
        switch (op){
            case "+" : outp = nr1 + nr2;
                break;
            case "-" : outp = nr1 - nr2;
                break;
            case "*" : outp = nr1 * nr2;
                break;
            case "/" : outp = nr1 / nr2;
                break;
            default :
                System.out.print("Invalid operator");
                break;
        }
        System.out.println("The result is " + outp);

    }
}
