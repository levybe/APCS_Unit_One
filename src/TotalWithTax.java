public class TotalWithTax {

    public static void main(String[] args)
    {
        //Declare the variables and the constant.
        final double TAXRATE = 0.0825;
        double price, tax, total;
        price = 52.75;
        tax = price * TAXRATE;
        total = price + tax;
        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + tax);
        System.out.println("Total: $" + total);
        //Make the calculations and assign
        //the results to the appropriate variables.
        //Print the results.
    }
}
