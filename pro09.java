/* Write a program that prompts the user to enter the side of a hexagon and displays its area. */

import java.util.Scanner;
public class pro09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side:- ");
        double side = sc.nextDouble();
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + area);
        sc.close();
    }
}
