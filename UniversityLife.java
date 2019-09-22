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
    System.out.println("  _    _       _                    _ _           _      _  __     ");
    System.out.println(" | |  | |     (_)                  (_) |         | |    (_)/ _|    ");
    System.out.println(" | |  | |_ __  ___   _____ _ __ ___ _| |_ _   _  | |     _| |_ ___ ");
    System.out.println(" | |  | | '_ \\| \\ \\ / / _ \\ '__/ __| | __| | | | | |    | |  _/ _ \\ ");
    System.out.println(" | |__| | | | | |\\ V /  __/ |  \\__ \\ | |_| |_| | | |____| | ||  __/");
    System.out.println("  \\____/|_| |_|_| \\_/ \\___|_|  |___/_|\\__|\\__, | |______|_|_| \\___|");
    System.out.println("                                           __/ |                   ");
    System.out.println("                                         |___/                    ");

    }

}
