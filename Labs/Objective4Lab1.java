import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

  java.util.Scanner Scanner = new java.util.Scanner(System.in);
  Scanner keyboard = new Scanner(System.in);

    System.out.print("What is your first name?");
    String fname = keyboard.nextLine();
    System.out.println(fname);

    System.out.print("What is your last name?");
    String lname = keyboard.nextLine();
    System.out.println(lname);

    System.out.print("What is your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println(favoriteAnimal);

    System.out.print("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();
    System.out.println(favoriteFood);

    System.out.print("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();
    System.out.println(favoriteSong);

    System.out.println("My name is " + fname + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");

    Scanner.close();
  }
}
