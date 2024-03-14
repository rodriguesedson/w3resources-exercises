/*
2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
 */

import java.util.Scanner;

class Ex002 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[2];
    
    System.out.println("Sum two numbers");

    for(int i = 0; i < 2; i++) {
      System.out.println("Type number " + (i + 1) + ":");
      numbers[i] = scanner.nextInt();
    }

    System.out.println(numbers[0] + numbers[1]);
  }
}