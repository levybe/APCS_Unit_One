import java.util.Scanner;

public class AddOneTakeOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        number--;
        System.out.print(number + " ");
        number++;
        System.out.print(number + " ");
        number++;
        System.out.print(number);
    }
}
