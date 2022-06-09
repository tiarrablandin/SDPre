public class Objective5Lab4 {
    public static void main(String[] args) {

      java.util.Scanner Scanner = new java.util.Scanner(System.in);

      System.out.println("Please enter a number: ");
      int num = Scanner.nextInt();
      System.out.println(num);

      if (num % 2 == 1) {
        System.out.println("The number is odd");
      }

      else if (num % 2 == 0) {
        System.out.println("The number is even");
        }

      Scanner.close();
  }
}
