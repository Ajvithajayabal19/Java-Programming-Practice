import java.util.Scanner;

class InvalidUserException extends Exception {

    public InvalidUserException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginSystem {

    static void login(String username, String password)
            throws InvalidUserException, InvalidPasswordException {

        String correctUsername = "admin";
        String correctPassword = "password123";

        if (!username.equals(correctUsername)) {
            throw new InvalidUserException("Invalid username");
        }

        if (!password.equals(correctPassword)) {
            throw new InvalidPasswordException("Invalid password");
        }

        System.out.println("Login successful");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {

            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                login(username, password);

                break;
            }

            catch (InvalidUserException e) {
                attempts--;

                System.out.println("Invalid username");

                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                }
            }

            catch (InvalidPasswordException e) {
                attempts--;

                System.out.println("Invalid password");

                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                }
            }

            finally {
                System.out.println("------------------------");
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked");
        }

        scanner.close();
    }
}