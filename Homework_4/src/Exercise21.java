//Write methods to calculate the area of a circle, rectangle, and triangle.
//Call these methods in the main program to compute areas for different inputs.

import java.util.Scanner;
import static java.lang.Math.*;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose what area do you want to compute (triangle/t, circle/c, rectangle/r): ");
        String choose = sc.nextLine();

        System.out.print("------------------------\n");

        switch (choose) {
            case ("t") -> {
                System.out.print("Enter the first side: ");
                double x = sc.nextInt();
                System.out.print("Enter the second side: ");
                double y = sc.nextInt();
                System.out.print("Enter the third side: ");
                double z = sc.nextInt();

                double area = areaTriangle(x, y, z);
                System.out.print("The area of the triangle is: " + area);
            }
            case ("c") -> {
                System.out.print("Enter the radius: ");
                double x = sc.nextInt();

                double area = areaCircle(x);
                System.out.print("The area of the circle is: " + area);
            }
            case ("r") -> {
                System.out.print("Enter the width: ");
                double x = sc.nextInt();
                System.out.print("Enter the length: ");
                double y = sc.nextInt();

                double area = areaRectangle(x, y);
                System.out.print("The area of the rectangle is: " + area);
            }
        }

    }

    public static double areaCircle (double x) {
        double pi = 3.14;
        return (x*x)*pi;
    }

    public static double areaTriangle (double x, double y, double z) {
        double sp;
        sp = (x + y + z)/2;
        return sqrt(sp*(sp-x)*(sp-y)*(sp-z));
    }

    public static double areaRectangle (double x, double y) {
        return x*y;
    }
}
