/* Write a java program that read a celcius degree in a double value from the console then converts it to fahrenheit and display the resilts the formula for the conversion is as follows fahrenheit = (9/5) * celcius + 32. */
import java.util.Scanner;
public class pro02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in celcius:- ");
        double celcius = sc.nextDouble();
        double fahrenheit = (9/5) * celcius + 32;
        System.out.println("The degree in fahrenheit is:- "+fahrenheit);
    }
}
