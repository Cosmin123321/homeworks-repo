//Calculate the area and circumference of a circle given its radius;
public class Ex_6 {
    public static void main(String[] args) {
        double pi = 3.14;
        int r = 15; //radius

        double x = pi * (r * r); //area formula, didn't manage to use pow method
        System.out.println("A = " + x);

        x = 2 * pi * r; //circumference formula
        System.out.println("C = " + x);
    }
}
