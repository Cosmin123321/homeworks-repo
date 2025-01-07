//Write a program that converts a temperature given in Celsius to Fahrenheit using primitive data types and operators;
public class Ex_4 {
    public static void main(String[] args) {
        double c = 36.18; //temperature in Celsius
        double f ; //temperature in Fahrenheit

         f = (c * 9 / 5 ) + 32;
        System.out.println("Temperature in Celsius = " + c);
        System.out.println("Temperature Converted to Fahrenheit = " + f);
    }
}
