
/* Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a 
triangle and displays its area. */
import java.util.*;
public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first point (x1, y1):- ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter the second point (x2,y2):- ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Enter the third point (x3,y3):- ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double area = side1 + side2 + side3;
        System.out.println("The area of the triangle is:- " + area);
        sc.close();
    }
}
