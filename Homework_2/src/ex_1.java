import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check the number");
        int nr = sc.nextInt();

        if (nr == 0){
            System.out.println("The number is 0");
        } else if ((nr * 1) > 0) {
            System.out.println("The number is positive");
        } else if ((nr * 1) < 0) { //if the number is positive nothing changes but if it's negative the sign will change
            System.out.println("The number is negative");
        } else {
            System.out.println("Invalid number");
        }
    }
}
