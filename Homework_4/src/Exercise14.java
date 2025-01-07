//Write a program that counts the number of vowels in a given string.

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = sc.nextLine();

        int vowCount = 0;

        for (int i = 0 ; i < word.length() ; i++) {
            if     (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'E' || word.charAt(i) == 'I' ||
                    word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                vowCount++;
            }
        }
        System.out.println(vowCount);
    }
}