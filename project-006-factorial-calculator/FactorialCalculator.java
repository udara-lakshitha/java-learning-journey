import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Factorial Calculator ---");
        System.out.println("Enter a non-negative number : ");
        int number = -1;

        try {
            number = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer");
            input.close();
            return;
        }

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long factorialResult = 1L;

            for (int i = number; i > 0; i--) {
                // check and avoid overflow before multiplication
                if (Long.MAX_VALUE / i < factorialResult && i > 0) {
                    System.out.println("Warning: Factorial result might exceed the maximum value for long");
                    break;
                }
                factorialResult *= i;
            }
            if (factorialResult != -1) {
                System.out.println("The factorial of " + number + "(" + number + "!) is " + factorialResult);
            } else {
                System.out.println("Could not calculate teh factorial of " + number + " due to the portential overflow");
            }
        }
        input.close();
        System.out.println("------------------------------------");
    }
}
