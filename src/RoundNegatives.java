import java.util.Scanner;

public class RoundNegatives {

    public static void main(String[] args)
    {
        // Create a Scanner object and write a prompt for the user to enter a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a negative decimal number: ");
        // Declare a variable of the correct type that will receive the input from the user.
         double number = scan.nextDouble();
        // Declare an variable and write an expression to round the user input
        int roundedNumber = (int) (number - 0.5);
        // ex. int roundedNum=/*expression to round a negative value*/;

        // Write a statement that will output the result in the form below.
        System.out.println(number + " rounded to a whole number is " + roundedNumber);
        // ex. -3.21 rounded to a whole number is -3

    }
}
