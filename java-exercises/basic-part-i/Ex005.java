/*
5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

import java.util.Scanner;

public class Ex005 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type de 1st and the 2nd numbers:");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int result = num1 * num2;

    System.out.println(num1 + " x " + num2 + " = " + result);
  }  
}
