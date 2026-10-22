import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        String lowerCaseSentence = sentence.toLowerCase();
        boolean isPangram = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            String letter = String.valueOf(ch);
            if (lowerCaseSentence.contains(letter)) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
        sc.close();
    }
}