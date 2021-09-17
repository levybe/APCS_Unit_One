import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents:");
        int remaining, changeDollar, changeQuarter, changeDime, changeNickel, changePenny;
        remaining = scan.nextInt();
        changeDollar = remaining / 100;
        remaining = remaining % 100;
        changeQuarter = remaining / 25;
        remaining = remaining % 25;
        changeDime = remaining / 10;
        remaining = remaining % 10;
        changeNickel = remaining / 5;
        remaining = remaining % 5;
        changePenny = remaining / 1;
        changePenny = remaining & 1;
        System.out.println("You have " + changeDollar + " dollars, " + changeQuarter + " quarters, " + changeDime + " dimes, " + changeNickel + " nickels, and " + changePenny + " pennies.");
    }
}
