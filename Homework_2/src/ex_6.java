import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int nr = sc.nextInt();

        int nrh = 1;
        while (nr != 0) {
            System.out.print(nrh + " ");
            nrh++; nr--;
        }
    }
}
