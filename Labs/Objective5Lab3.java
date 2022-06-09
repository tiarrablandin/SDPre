public class Objective5Lab3 {
    public static void main(String[] args) {

      java.util.Scanner scanner = new java.util.Scanner(System.in);

      System.out.println("Please enter a number: ");
      int userNum = scanner.nextInt();
      System.out.println(userNum);

      if (userNum > 0) {
        System.out.println("The number is positive");
      }

      else if (userNum < 0) {
        System.out.println("The number is negative");
        }

      scanner.close();
  }
}
