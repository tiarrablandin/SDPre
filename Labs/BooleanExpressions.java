import java.util.Scanner;

public class BooleanExpressions {

    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);

      System.out.println("Please choose two numbers.");
      System.out.println("First number: ");
      double num1 = kb.nextDouble();
      System.out.println("Second number: ");
      double num2 = kb.nextDouble();

      boolean bool1 = (num1 < num2);
      boolean bool2 = (num1 > num2);
      boolean bool3 = (num1 <= num2);
      boolean bool4 = (num1 >= num2);
      boolean bool5 = (num1 == num2);
      boolean bool6 = (num1 != num2);

      System.out.println(num1 + " is less than " + num2 + ": " + bool1);
      System.out.println(num1 + " is greater than " + num2 + ": " + bool2);
      System.out.println(num1 + " is less than or equal to " + num2 + ": " + bool3);
      System.out.println(num1 + " is greater than or equal to " + num2 + ": " + bool4);
      System.out.println(num1 + " is equal to " + num2 + ": " + bool5);
      System.out.println(num1 + " is not equal to " + num2 + ": " + bool6);
    }
}
