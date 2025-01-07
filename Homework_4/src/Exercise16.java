//Write a program to count the number of characters (excluding spaces) in a string

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = sc.nextLine();

        int characters = 0;

        for (int i = 0 ; i <= word.length() - 1 ; i++) {
            if (word.charAt(i) == ' ') { //instruction to continue the loop while ignoring the spaces
            } else {
                characters++;
            }
        }
        System.out.print(characters);
    }
}