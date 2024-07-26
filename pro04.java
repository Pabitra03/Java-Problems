/* Write a program that reads in the radius and length of a cylinder and computes the area 
and volume using the following formulas:
area = radius * radius * pi
volume = area * length */
import java.util.Scanner;
public class pro04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder:- ");
        double radius = sc.nextDouble();
        System.out.print("Enter the length of the cylinder:- ");
        int length = sc.nextInt();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The area of the cylinder is:- " + area);
        System.out.println("The volume of the cylinder is:- " + volume);
        sc.close();
    }
    
}
