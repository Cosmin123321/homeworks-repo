import java.util.Random;

public class ex_10 {
    public static void main(String[] args) {
        int[] nr = new int[10];
        Random rnd = new Random();

        for (int i = 0 ; i < nr.length ; i++) {
            nr[i] = rnd.nextInt(100);
        }

        System.out.print("Values: ");
        for (int n : nr) {
            System.out.println(n + ' ');
        }
        System.out.println();

        int min = nr[0];
        int max = nr[0];

        for (int i = 1 ; i < nr.length ; i++) {
            if (nr[i] < min) {
                min = nr[i];
            }
            if (nr[i] > max) {
                max = nr[i];
            }
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
}
