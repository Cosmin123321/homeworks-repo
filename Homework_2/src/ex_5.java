import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter ");
        String let = sc.next();


        switch (let) {
            case "a": System.out.println("Letter " + let + " is a vowel");
                break;
            case "e": System.out.println("Letter " + let + " is a vowel");
                break;
            case "i": System.out.println("Letter " + let + " is a vowel");
                break;
            case "o": System.out.println("Letter " + let + " is a vowel");
                break;
            case "u": System.out.println("Letter " + let + " is a vowel");
                break;
            case "A": System.out.println("Letter " + let + " is a vowel");
                break;
            case "E": System.out.println("Letter " + let + " is a vowel");
                break;
            case "I": System.out.println("Letter " + let + " is a vowel");
                break;
            case "O": System.out.println("Letter " + let + " is a vowel");
                break;
            case "U": System.out.println("Letter " + let + " is a vowel");
                break;

            default:
                System.out.println("Consonant or invalid output");
                //didn't manage to make an if for consonant without
                //writing all of them
                break;
        }
    }
}
