/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of 
two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the 1st number:");
        int a = scanner.nextInt();

        System.out.println("Insert the 2nd number:");
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        float mult = a * b;
        float div = a / b;
        int mod = a % b;

        System.out.println(
            a + " + " + b + " = " + sum + "\n" +
            a + " - " + b + " = " + sub + "\n" +
            a + " x " + b + " = " + mult + "\n" +
            a + " / " + b + " = " + div + "\n" +
            a + " mod " + b + " = " + mod
        );
    }
}
