import java.util.Scanner;

public class AverageRounded {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double value;
        System.out.println("Enter three positive decimal numbers:");
        value = scan.nextDouble();
        value += scan.nextDouble();
        value += scan.nextDouble();
        value = (int) value / 3;
        System.out.println("Average = " + value);

    }
}
