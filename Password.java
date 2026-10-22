import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        int sa = 0;

        if (password.length() >= 8) {
            sa++;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            }
            else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            }
            else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }

        if (hasUpper) {
            sa++;
        }

        if (hasLower) {
            sa++;
        }

        if (hasDigit) {
            sa++;
        }

        if (sa == 4) {
            System.out.println("Password strength: strong");
        }
        else if (sa == 3) {
            System.out.println("Password strength: medium");
        }
        else {
            System.out.println("Password strength: weak");
        }

        sc.close();
    }
}