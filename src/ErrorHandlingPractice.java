import java.util.Scanner;

public class ErrorHandlingPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        boolean flag = true;
        while (flag) {

            System.out.println("Please enter your password: ");
            password = Integer.parseInt(scanner.nextLine());
            try {
                if (password != 12345) {
                    throw new PasswordException("Your password is wrong!!!");
                } else {
                    flag = false;
                    System.out.println("Your password is true");
                }

            } catch (PasswordException e) {
                System.err.println(e.getMessage());
            }

        }


    }


}
