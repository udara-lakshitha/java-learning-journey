import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1, number2;
        double result = 0.0;
        boolean isSuccess = true;
        String operator;

        System.out.println("--- Simple Console Calculator ---");
        System.out.println("Enter the first number : ");
        number1 = sc.nextDouble();
        System.out.println("Enter the operator (+, - ,*, /) : ");
        operator = sc.next();
        System.out.println("Enter the second number : ");
        number2 = sc.nextDouble();

        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                System.out.println("Error: Divided by zero is not allowed.");
                isSuccess = false;
            }
        } else {
            System.out.println("Error: Invalid operator");
            isSuccess = false;
        }

        if (isSuccess) {
            System.out.println("The result is : " + number1 + " " + operator + " " + number2 + " = " + result);
        }
        sc.close();
        System.out.println("---------------------------------");
    }
}
