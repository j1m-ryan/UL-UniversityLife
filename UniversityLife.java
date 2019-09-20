import java.util.Scanner;

public class UniversityLife {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    System.out.println("Welcome to UL: University Life");
    System.out.println("What is your name?");

    String name = reader.nextLine();

    System.out.println("Lovely to meet you " + name +"!");
  }
}
