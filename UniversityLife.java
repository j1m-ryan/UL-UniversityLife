import java.util.Scanner;

public class UniversityLife {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    greeter();

    System.out.println("What is your name?");

    String name = reader.nextLine();

    System.out.println("Lovely to meet you " + name +"!");

    }

  public static void greeter() {

    System.out.println("Welcome to UL: University Life");
    }

}
