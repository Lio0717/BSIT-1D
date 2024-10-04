import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "Hatdogs";
        String correctPassword = "Gjulio";

        System.out.println("Enter username: ");
        String username = sc.next();

        if (username.equals(correctUsername)) {
            System.out.println("Correct!");
            System.out.println("Enter password: ");
            String password = sc.next();

            if (password.equals(correctPassword)) {
                System.out.println("Welcome!");

                
                System.out.println("Enter num1: ");
                double num1 = sc.nextDouble();

                System.out.println("Enter num2: ");
                double num2 = sc.nextDouble();

                System.out.println("Enter operator: (+, -, *, /)");
                char operator = sc.next().charAt(0);
                double result;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            return;  
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        return;  
                }

                System.out.println("Result: " + result);  

            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Username not found");
        }
    }
}
