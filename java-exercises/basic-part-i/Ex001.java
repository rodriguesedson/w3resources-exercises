/* Write a Java program to print 'Hello' on screen and your name on a separate line.
Expected Output :
Hello
Alexandra Abramov */

import java.util.Scanner;

public class Ex001 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What's your name?");
    String name = scanner.nextLine();

    System.out.println("Hello, " + name);
  }
}
