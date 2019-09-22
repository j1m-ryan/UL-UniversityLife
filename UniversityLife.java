import java.util.Scanner;
import java.lang.*;






public class UniversityLife {


  public static void main(String[] args) {





    opening();
    pauseGame();
    clearScreen();
    greeter();
    pauseGame();




    }
//prints out some ascii art
  public static void opening() {


    System.out.println("  _    _       _                    _ _           _      _  __     ");
    System.out.println(" | |  | |     (_)                  (_) |         | |    (_)/ _|    ");
    System.out.println(" | |  | |_ __  ___   _____ _ __ ___ _| |_ _   _  | |     _| |_ ___ ");
    System.out.println(" | |  | | '_ \\| \\ \\ / / _ \\ '__/ __| | __| | | | | |    | |  _/ _ \\ ");
    System.out.println(" | |__| | | | | |\\ V /  __/ |  \\__ \\ | |_| |_| | | |____| | ||  __/");
    System.out.println("  \\____/|_| |_|_| \\_/ \\___|_|  |___/_|\\__|\\__, | |______|_|_| \\___|");
    System.out.println("                                           __/ |                   ");
    System.out.println("                                         |___/                    ");




}
  //this prints 1000 lines to clear the screen
  public static void clearScreen() {

        for(int clear = 0; clear < 1000; clear++) {

        System.out.println("\b") ;
    }

  }
  //this pauses the game for 3 seconds
  public static void pauseGame() {

      long original = System.currentTimeMillis();

      while (true) {

          if ( System.currentTimeMillis() - original >= 3000) {

              break;
            }
        }
  }

  //this greets the player
  public static void greeter() {

      Scanner reader = new Scanner(System.in);

      System.out.println("What is your name?");

      String name = reader.nextLine();

      System.out.println("Lovely to meet you " + name +"!");
  }

 //this will print the game menu
 public static void menu() {



 }

}
