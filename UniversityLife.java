import java.util.Scanner;
import java.lang.*;

public class UniversityLife {

  public static void main(String[] args) {

    opening();

    pauseGame();

    clearScreen();

    menu();

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

   Scanner reader = new Scanner(System.in);

   System.out.println("*************************************************");
   System.out.println("  __  __       _         __  __                  ");
   System.out.println(" |  \\/  |     (_)       |  \\/  |                 ");
   System.out.println(" | \\  / | __ _ _ _ __   | \\  / | ___ _ __  _   _ ");
   System.out.println(" | |\\/| |/ _` | | '_ \\  | |\\/| |/ _ \\ '_ \\| | | |");
   System.out.println(" | |  | | (_| | | | | | | |  | |  __/ | | | |_| |");
   System.out.println(" |_|  |_|\\__,_|_|_| |_| |_|  |_|\\___|_| |_|\\__,_|");
   System.out.println("*************************************************");
   System.out.println("");
   System.out.println("");
   System.out.println("****************");
   System.out.println("Play");
   System.out.println("Credits");
   System.out.println("Quit");
   System.out.println("****************");
   System.out.println("Type a command:");

   while (true) {

   String command = reader.nextLine();

     if (command.equals("Play")) {

      greeter();


    }else if (command.equals("Credits")) {

      System.out.println("Jim Ryan");

      pauseGame();

      //image of Jim
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNmmmmNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNNNNNNNNNmmNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNmNNNNNNmmNNNNNNNNNNNNNNNmNNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNmNNNmNNmmmmNNNNNNNmmNNNNNmmNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMNMMMMMMMMMMMMNNNNNNNNmNNNmmmmmmmmmmmddddyssyyhhdmmmNNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMNNMMMMMMMMMMMNNNNNNNNmmmmmmmmddhsoosyyso///++ossydmNmNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMNMMMMMMMMMMMNNNNmNNNNmmdddhhhy+::://///:::://++osyhmmNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMNMMMMMMMMMMMMMMNNNmmmmddyyhsss/::----------::///+osshdNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMNNNNNNmdddhoo+//::--..........--::/++oosydmNNMMMMMMMMMMMMMMMMMMMMMMMMNNMMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMMMMNNMNNmmmmhyyo+///:--..````````...--://++ooshmNNNMMMMMMMMMMMMMMMMMMMMMNmsdNMMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMMNdhNNNNNNmmmdso++//::--..````````..--:://++ooshdmNNNMMMMMMMMMMMMMMMMMMMMNhodNNMMM");
      System.out.println("MMMMMMMMMMMMMMMMMMNd+ohNNNNNmmmdyo++//::---.......``..-::+oossyyhhhmNNNMMMMMMMMMMMMMMMMMMMMNNNMMMMMN");
      System.out.println("MMMMMMMMMNNNNNNNNNNd/sdNNNNNmmmdyo++///::::--.....``.-/oyyyhyyhhddhdNmmNMMMMMMNMMMMMMMMMMMMMMMMMMMMN");
      System.out.println("MMMNMNMNNMMMNNNNNNNNNNmmmNNNNmmhsso+++oooosss+/::-..:/ooo+//++++osyhmyodNMMMMNNMMMMMMMMMMMMMMMMMMMMN");
      System.out.println("NNNNNNNNNNNNNNNNNNNNNNNNmdmNNmmhysssyyyyso+oo++/:----/+:-:syyoss+/+shy/oNNMMMNdNMMMMMMMMMMMMMMMMMMMN");
      System.out.println("NNNNNNNNNNNNNNNNNNNNNNNNNmdmNmmdyssyyo//+ooo:--:/:::/++::--:/++///+oys/sNNNMMNdNMMMMMMMMMMMMMMMMMMMN");
      System.out.println("NNNNNNNNNNNNNNNNNNNNNNNNNmmddddmyso+//+s+oo/---://///+o++/////////+oyo/dNNNMMNdMMMMMMmmMMMMMMMMMMMMM");
      System.out.println("NmmmmmmmNNNNNNNNNNNNNNNNNNNms+ohhs+:::://:---:///++///oo+/://////++oyo+mNNNMMNmNMMMMNmmMMMMMMMMMMMMM");
      System.out.println("mddddmmmmmmmmmmmmNNNNNNNNNNNh+//hyo/:::::--::::::/++///+o+:.--:://+oyooNNNNNNNmMMMMMMNhNMMMMMMMMMMMM");
      System.out.println("mhhhhdddmmmmddddmmmmNNNNNNNNmh/:/yso/::::::::--:+++/:--/++/...--:/+oyhhmNmNNNNmNNNNMNMNMmmMMMMMMMMMM");
      System.out.println("dhhhhhddddddddddmddmmNNNNmNNmms//oys+/::::--...-////:-:/++/-----:/+oymNmmmmmNNmmmmNNNNNNNNMMMMMMMMMM");
      System.out.println("hhhhhhhhhddhhddddddmmNmmmmNNNNmy+/+ys+//::-....-:++:::::/++/:-:/:/+ohmNNmmmmNNNNNNNNNNNNMMMMMMMMMMMM");
      System.out.println("hhhhhhhhddhhhddddddmmmmmmmNNmNNmysoyys++/:-----:/+//:///+o+++/:/:/+ohNNmmmmmNNNNNNNmmmNNMMMMMMMMMNNM");
      System.out.println("hhhhhhhhdhhhdmdddddddmmmdmmmmmNNmdmmdyo+/:----:/+oooo++ooooo/--://oymNNmmmmmNNNNNNNNmmNNMMMMMMMMMNMM");
      System.out.println("hhhhhhdddhhdmdhddhdddmmNNmmmmmmmmmmmmdyo/::::--:/+++///////::-://+sdNNNmmmmmNNNNNNNNNNNNMMMMNmNMMMMM");
      System.out.println("hhhhddddhhdmmddddmmNNNNNNNNNNNmNNmmmmdhyo+/::---:::::://:---::/+oshmmmNmmmmmNNNNNNNNmNNNMMMMMMMMMMMM");
      System.out.println("hhhhddddddmmmmmNNNNNNNNNNNNNNNNNmmmmmdyyso+///::----..--.--:/+ossshdmmmmmmmNNNmNNNNNmNNNMMMMMMMMMMMM");
      System.out.println("dhhhddddmmdmmNNNNNNNNNNNNNNNNNNNmmmmmdsooooo++//:::--...--:/ooo++oyddddmmmNNNNNNNNNNNNNNMNNNMMMMMMMM");
      System.out.println("dhhhdddmmmmNNNNNNNNNNNNNNNNNNNNNNmmmdhyo+++++oooo++///:://+oo+/+++shhhddmmmNNNNNNNNNNNNMNNNNNNNNMNNN");
      System.out.println("dddhddmmmNNNNNNNNNNNNNNNNNNNNNNNNmmmdhho++///://++++++//////////++sssydddmmmNNNNNNNNNNNNNNNNNMMMMMMM");
      System.out.println("dmddmmNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmdhhyo///:::::::::::::://::://+oo+oyhhhdmmNNNNNNNNNNNNmmmNNNNNNNM");
      System.out.println("dmddNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmdyyyy+/:::----::-----::::::///++/:+yyhhdmmNNNNNNNmmmmmmmmmNNmmNN");
      System.out.println("mddmNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmdysyyyo/::-----------::::::/:/++/::yyhhhdmmmNmNNNNmmmmmmmmmmmNNN");
      System.out.println("mmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmdhsssyys/:----------::---:::-:++/::syyyhhhmNNNNNNNNNNNmmmmmmmmmN");
      System.out.println("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmmdyysssyyo/----..------.---:---////+ssyyssyhmNNNNNNNNNNNdmmmmmmmN");
      System.out.println("mNNNNNNNNNNNNNNNNNNNmNNNNNNNmmmmmmmmdyyyssyyys/--...........----.--::/sssyyyssydNNmNNNNNNNmmNmmmmmmm");
      System.out.println("mNNNNNNNNmmmmNNNNNmmNNNNmmmmmmmmmmmmmhssssyyyss+:............--.--/+osysssshhddmmmmNNNNNmmmmNNmNmmmm");
      System.out.println("mNNNNNmmmmmmNNNNNmmmmmmmmmmmmmmmmmmmmmysssssyysss/-............-+osyssoosssymmmmmmmmNmmmmmmmmmmmmmmm");
      System.out.println("mNNmmmmmmmmmmmmmmmmmmmmmddmmmmmmmmmmmmdssssosssyyso+::-......-/osssssssssssymmmmmmmmmmmmmmmmmmmmmmmm");
      System.out.println("mmmmmmmmmmmmmmmmmddmmmmmdmmmmmmmmmmmmmmhsssooossyys+sso:...-/ossssssyyyyyyyydmmmmmmmmmmmmmmmmmmmmmmm");
      System.out.println("dmmmmmmmmmmmmmmmmdmmmmmmmmmmmmmddmmmmmmdyyyssssyyyhyyyyys-:oyyyhysyyyyyyyyyhdmmmmmmmNmmmmmmmmmmmmmmm");
      System.out.println("dmmmmmmmmmmmmmmmmdmmmmmmmmmmmmmdddmmmmmmmhyyyyssyhhhhyyyhyyyyhyysossssssyyyydmmmNmmmNmmmmmmmmmmmmmmm");
      System.out.println("mmmdmmmmmmmmmmmmddmmmmmmmmmmmmmmmmmmmmmmmdyyyssooysyhyssyhysyyssoooossssssyshmmmmmmmmmmmmmmmmmmmmmmm");

      pauseGame();

      clearScreen();

      System.out.println("Tom Carey");

      pauseGame();

      //image of Tom
      System.out.println("NNNNNmmmmmmmmmmmmmmmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmNmNNNNNNNmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmmmmmmmmmmmmNmmmdhyysso/::/+oooooooydmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmmmmmmmmmmmmmmmmmdhyo:-------.--:----:::://+shdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmmmmmdyso/:-....------..---..-:----:::::/+ymNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmmmd+-..```````.....`.```````.....--://///+yhmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmhs/-.````````````````````````.....-:::::://++shNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmNmmmds-.`````````````````````````.....-://---://:/+oomNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmmmh+.`````````````..-::/::-.....----::/:::::/o++++++hNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmmd+.```` ``````..-/+oooooo++/////++ooosoososssso+ooosNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmd+.`````````.-:/+ossssyyyysssssssyyyyhddddddddddyo++smNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmy-`````````.-/+ossysyyyyyyyyyyyhhhddddmmmmmmmmNNNms+sdNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmms..```````.-:/+ossysyyyyyyyyhhhddddmmmmmmmmNNNNNNNNydNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmo-````````.-/+ossyyyyyyyyyhhhhdddmmmmmmmNmNNNNNNNNNmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmm+.````````.-+osssyyyyyyyyyhhhhhddmmmmmmmmmNNNNNNNNNNdNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmm+.````````.-+osssyyyyyyyyyhhhhhdddmmmmmmmmmmmNNNNNNNddNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmms.````````.-/osssyyyyyyyyyyhhhhdddmmmmmmmmmmmNNNNNNNdhNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmy.```````..:+osssssyyyyyyyyhhhhddddmmmmmmmmmmNNNNNNNddNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmh.````````.:+osssssssyyyyyhhhhhdddddmmmmmmmmNNNNNNNNmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmm:````````.:+oosssssssoooossyyhhhddddmmmmmmmNNNNNmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmds:.``````-/+ooooso+/:-::::-:::/+osyhhddddmmddhsoosyymNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmh//+/.`````-+oooooo//::/+oooo++:::/+osyhddmdyo/+syhdmdNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmms:/++/` ```-+ooooo+++++///::/ooo+/++osyhmmms/:.-syosmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmy/+++//````:+osooo++/:--.-..-hy//+o++oshmNmy++/+hdhdmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmd/+/::/.``.-+oossooo+///////+sso+o++oosydNNdysyhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmd++::/o/``.:+oosssosssoooosssssooooooossydNNmddmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmo++/://``-/ooossssssyysyyyyyyssssooooooshmNNNmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmdo+o++/.`-+oooossssyyyyyyyyyyyyssoooooosydmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmmy+ooo+-`./ooooosssyyyyyyyyyyyyssoo++oosshdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNNmmmmmmmmysoo/:`.:+oooosssssyyyyyyyyyyss+++oossyhmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmdhhs..-+oooooossssyyyyyyyyyso++oooosshddmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmds.../+ooooooossyyyhhhhyyyso+++/+oyhhmNNNNNNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmds-../++++ooooossyyyhhhyysso+/::ososoymmNNNNmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmmd:`.:++++++ooosssyyyyyso+//:--:o/::++oyhmNNmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmmmmmmmmmmmmd/``./+++++oooossssss+:--:/:/+osysossoosymmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmmddmmmmmmmmds+-``.:/++++oooooooo/:://:::::/+oosyyysoshdmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmddddddmmdddsoo/-` .:////+++o++/::/+oo+///+osyyhdmmhooodmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmdddddddddhsooo++:` `.---://:::..-/+oooooossssydmmmy+/+dmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("NNNNNmmdddhyyhyssoooo+++:`  ````..````.-:/++ooooososydmmds::+hmmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("mNNNNmdhy/.``-/oooooo+++/:.`        ````.-:/+osssssshddys+:-.-/sdmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("mNNNNy/.`      `-/+o++++++/-`        ` ``..-://++ooooso+//-.```.:smmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("mNmy:`            .:++++++++/-``       `````.-.:/+/:-//-:-.`````..+dmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNN");
      System.out.println("ho-                 `-/+++ooo+/:-.`         `.`--::..--..`..````...-smmmmmmmmmmmmNNNNNNNNNNNNNNNNNNN");
      System.out.println("`                      `-/+oooooo++:--.`````.....-::::.````..````....+mmmmmmmmmmmmmmmNNNNNNNNNNNNNNN");
      System.out.println("                          `-/osyyyyhhhhhyhhhyydhddmds:``````..``.`..``/mmmmmmmmmmmmmmmmmNNNNNNNNNNNN");
      System.out.println("                             `.:oyhhddmmmmNNNNNNNNmh+.```.```...`....``ommmmmmmmmmmmmmmmmmmmmmNNNNNN");
      System.out.println("                                 `.-/oshdmmmNNmmhy+-`````.````...`....`.hmmmmmmmmmmmmmmmmmmmmmmmmmmm");
      System.out.println("                                       ``.-::::-.`````````.````..`....``:dmmmmmmmmmmmmmmmmmmmmmmmmmm");
      System.out.println("                                         `````````````````.``.`...`....``smmmmmmmmmmmmmmmmmmmmmmmmmm");
      System.out.println("                                    ``   `````````````````````.`........`.ydmmmmmmmmmmmmmmmmmmmmmmmm");
      System.out.println("                          `      `    ````````````````````````...........`-dddddddddddmmmmmmmmmmmmmm");

      pauseGame();

      clearScreen();

      System.out.println("Thank you for playing!");






    }else if (command.equals("Quit")) {

      System.exit(0);

    }else {

      System.out.println("That is not a valid command");

    }

  }

 }

}
