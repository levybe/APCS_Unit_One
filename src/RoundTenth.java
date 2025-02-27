import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Prompt the user for a positive decimal number
        System.out.println("Decimal number?");
        double number = scan.nextDouble();

        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/
        double rounded = (int) ((number + 0.05) * 10) / 10.0;

        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5
        System.out.println(number + " rounded to the nearest tenth is " + rounded);


    }
}
