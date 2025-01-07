//Write a program to check if a given string is a palindrome.

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String palCheck = sc.nextLine();

        System.out.println(palTest(palCheck));
    }
        public static boolean palTest (String palCheck) {

            if (palCheck.length() == 1) {
                System.out.println("Write a longer word");
            }

            int check1 = 0;
            int check2 = palCheck.length() - 1;

            for (int i = 0; i < palCheck.length() / 2; i++) {
                if (palCheck.charAt(check1) != palCheck.charAt(check2)) {
                    return false;
                }
                check1++;
                check2--;
            }
            return true;
        }
    }
