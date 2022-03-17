
import java.util.Scanner;
public class Lab06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;

        System.out.print("Enter first number: ");
        firstNumber = input.nextDouble();
        System.out.print("Enter second number: ");
        secondNumber = input.nextDouble();
        System.out.println("The addition of both numbers is " + (firstNumber + secondNumber));

    }
}
