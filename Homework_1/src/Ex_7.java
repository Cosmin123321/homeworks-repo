//Write a Java program to swap two variables;
public class Ex_7 {
    public static void main(String[] args) {

    double a = 18.214; double b = -214.3; double z;

        System.out.println("Starting Values");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //swapping a with b

        z = a;
        a = b;
        b = z;

        System.out.println("Swapped Values");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
