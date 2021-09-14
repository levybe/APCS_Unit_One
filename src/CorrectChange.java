import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents:");
        int change, changeDollar, changeQuarter, changeDime, changeNickel, changePenny;
        change = scan.nextInt();
        changeDollar = change / 100;
        changeQuarter = change % 100;
        changeQuarter = changeQuarter / 25;
        changeDime =
        changeDime = changeQuarter % 10;
        changeNickel = changeDime % 5;
        changePenny = changeNickel % 1;
        System.out.println("You have " + changeDollar + " dollars, " + changeQuarter + " quarters, " + changeDime + " dimes, " + changeNickel + " nickels, and " + changePenny + " pennies.");
    }
}
