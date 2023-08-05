import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("The division result is: " + result);
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
