/*
3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
*/

import java.util.Scanner;

class Ex003 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type the dividend:");
    int dividend = scanner.nextInt();

    System.out.println("Type the divisor:");
    int divisor = scanner.nextInt();

    System.out.println(dividend / divisor);
  }
}