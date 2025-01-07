import java.util.Scanner;

public class str_manipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String test = sc.nextLine();

        System.out.print("Reversed String -> " + str_reversed(test));
        System.out.println();
        System.out.print("Number of Vowels -> " + vowel(test));
    }

    public static int vowel(String str) {
        String vowels = "aeiouAEIOU";
        int v_count = 0;
        for (char check : str.toCharArray()) {
            if (vowels.indexOf(check) != -1) {
                v_count++;
            }
        }
        return v_count;
    }

    public static String str_reversed(String a) {
        String str_reversed = "";
        for (int i = a.length() - 1 ; i >= 0 ; i--) {
            str_reversed += a.charAt(i);
        }
        return str_reversed;
    }
}
