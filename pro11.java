/* Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays
their distance between them. */
import java.util.Scanner;
public class pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first point (x1, y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter the second point (x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        System.out.println("The distance between the two points is: " + distance);
        sc.close();
    }
}
