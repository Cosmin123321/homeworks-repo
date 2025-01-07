import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] names = new String[6];
        for (int i = 1 ; i < 6 ; i++) {
            System.out.println("Enter a name: ");
            names[i] = sc.next();
        }
        System.out.println("Reversed order: ");
        for (int i = 5 ; i >= 0 ; i--){
            System.out.print(names[i] + " ");
        }
    }
}
