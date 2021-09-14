import java.util.Scanner;

public class FindTheAverage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double averageValue, value1, value2, value3, value4;
        averageValue = 0;
        System.out.println("Enter four values.");
        System.out.println("Value 1: ");
        value1 = scan.nextDouble();
        averageValue += value1;
        System.out.println("Value 2: ");
        value2 = scan.nextDouble();
        averageValue += value2;
        System.out.println("Value 3: ");
        value3 = scan.nextDouble();
        averageValue += value3;
        System.out.println("Value 4: ");
        value4 = scan.nextDouble();
        averageValue += value4;
        averageValue /= 4;
        System.out.println("Average = " + averageValue);
    }
}