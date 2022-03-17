
import java.util.Scanner;
public class Lab06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        int menuSelection;


        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.print("Please make a selection ");
        menuSelection = input.nextInt();

        if( menuSelection == 1) {
            System.out.print("Enter first number: ");
            firstNumber = input.nextDouble();
            System.out.print("Enter second number: ");
            secondNumber = input.nextDouble();
            System.out.println("The addition of both numbers is " + (firstNumber + secondNumber));
        }
        if (menuSelection == 2)
        {
            System.out.print("Enter first number: ");
            firstNumber = input.nextDouble();
            System.out.print("Enter second number: ");
            secondNumber = input.nextDouble();
            System.out.println("The subtraction of both numbers is " + (firstNumber - secondNumber));
        }
    }
}
