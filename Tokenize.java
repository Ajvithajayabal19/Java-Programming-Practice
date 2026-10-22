import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuilder finalResult = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            finalResult.append(temp);
            if(tokenizer.hasMoreTokens()){
                finalResult.append(" ");
            }
        }
        System.out.println("Original:" +sentence);
        System.out.println("Modified:" + finalResult.toString());
        sc.close();
       
    }
    
}
