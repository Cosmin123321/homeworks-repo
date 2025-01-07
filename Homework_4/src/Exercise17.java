//Write a program to compare two strings and check if they are equal
// (case-sensitive and case-insensitive).

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String word1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = sc.nextLine();

        boolean check = true;

        if (word1.length() == word2.length()) {
            for (int i = 0; i <= word1.length() - 1; i++) {
                for (int j = 0; j <= word2.length() - 1; j++) {
                    if (word1.charAt(i) != word2.charAt(j)) {
                        check = false;
                        break;
                    }
                }
            }
        } else check = false;

        if (check == false) {
            System.out.print("The strings are not equal");
        } else {
            System.out.print("The strings are equal");
        }
    }
}