
import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Percentage");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            case 5:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + ((num1 / num2) * 100));
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        scanner.close();
    }
}
