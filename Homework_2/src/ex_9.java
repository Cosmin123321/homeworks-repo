import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert n: ");
        int n = sc.nextInt();
        int i2 = 0;

        for (int i = 0 ; i <=n ; i++ ) {
            System.out.print(i2 + " ");
            i2 += 2;
        }
    }
}
