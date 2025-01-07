//Write a Java program that takes a number as input and prints its multiplication table up to 10;
public class Ex_1 {
    public static void main (String[] args) {

        int x = 5; int y;

        for (int i = 1; i <= 10; i++) {

            y = x * i;
            System.out.println("y = " + y);
        }
    }
}
