import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    System.out.println("Please provide a number with no more than two decimal places: ");
      num1 = kb.nextDouble();
    System.out.println("Please provide a second number with no more than two decimal places: ");
      num2 = kb.nextDouble();

      while (keepGoing) {
        printMenu();
        System.out.println("Which would you like to do? ");
        choice = kb.nextInt();

        switch(choice) {
            case 1:
            System.out.println(num1 + " + " + num2 + " = " + findSum(num1, num2));
            break;
            case 2:
            System.out.println("The average of " + num1 + " and " + num2 + " is: " + findAverage(num1, num2));
            break;
            case 3:
            System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: $" + calcTax(num1, num2));
            break;
            case 4:
            System.out.println("You've chosen to quit.");
            return;
            default:
            System.out.println("Invalid entry. Please try again");
            break;
        }
      }

      kb.close();
  }

  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|    1. Add Numbers    |");
    System.out.println("|    2. Find Average   |");
    System.out.println("|    3. Calculate Tax  |");
    System.out.println("|    4. Exit           |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println("                        ");

  }

  public static double findSum(double x, double y) {
    double sum = Math.round((x + y) * 100) / 100.00;
    return sum;
  }

  public static double findAverage(double x, double y) {
    double average = (x + y) / 2;
    double averageRounded = Math.round(average * 100) / 100.00;
    return averageRounded;
  }

  public static double calcTax(double x, double y) {
    double currentTax = .0831;
    double taxTotal = Math.round(((x + y) * currentTax) * 1000) / 1000.000;
    return taxTotal;
  }

}
