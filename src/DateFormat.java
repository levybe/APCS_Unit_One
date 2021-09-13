import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the current month? ");
        String month = scan.nextLine();
        System.out.println("What is the day of the week? ");
        String dow = scan.nextLine();
        System.out.println("What is the current year? ");
        int year = scan.nextInt();
        System.out.println("What is the day of the month? ");
        int dayOfMonth = scan.nextInt();
        System.out.println("American Format:\n" + dow + ", " + month + " " + dayOfMonth + ", " + year + "\n" + "European Format:\n" + dow + ", " + dayOfMonth + " " + month + ", " + year);
    }
}
