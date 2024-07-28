/* Write a program that reads in investment amount, annual interest rate, and number of 
years, and displays the future investment value using the following formula:
futureInvestmentValue =investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, 
the future investment value is 1032.98 */
import java.util.Scanner;
public class pro13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the investment amount:- ");
        double amount = sc.nextDouble();
        System.out.println("Enter the annual interest rate:- ");
        double interest = sc.nextDouble();
        interest /= 1200;
        System.out.println("Enter the number of years:- ");
        int year = sc.nextInt();
        double future = amount * Math.pow(1 + interest , year * 12);
        System.out.println("The future investment Amount is:- " + future);
        sc.close();
    }
}
