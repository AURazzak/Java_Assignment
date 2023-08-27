import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Available operations: +,-,*,/ ");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Operator (+,-,*,/): ");
        char operator =scanner.next().charAt(0); //for input only 1 character

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0.0;

        switch (operator){
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
                if(num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println("Result: "+result);

        scanner.close();
    }
}
