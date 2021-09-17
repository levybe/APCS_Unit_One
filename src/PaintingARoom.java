import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length, width, height, totalSurfaceArea;
        int doorCount, windowCount, totalPaintRequired;
        System.out.println("What is the length of the room in square feet?");
        length = scan.nextDouble();
        System.out.println("What is the width of the room in square feet?");
        width = scan.nextDouble();
        System.out.println("What is the height of the room in square feet?");
        height = scan.nextDouble();
        System.out.println("How many doors are in the room?");
        doorCount = scan.nextInt();
        System.out.println("How many windows are in the room?");
        windowCount = scan.nextInt();
        totalSurfaceArea = ((length * height) * 2) + ((width * height) * 2) + (length * width) - (doorCount * 15) - (windowCount * 10);
        System.out.println("The total surface area of your room is " + totalSurfaceArea + " ft^2, not including doors and windows.");
        totalPaintRequired = (int) ((totalSurfaceArea / 350) + 0.99999999999999999999999999999999999999);
        System.out.println("You will need " + totalPaintRequired + " gallons of paint to paint the walls and ceiling of the room.");


    }

}
