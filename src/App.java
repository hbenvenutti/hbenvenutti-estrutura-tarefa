import java.util.Scanner;

public class App {
  // * --- vars ----------------------------------------------------------- * //
  static Scanner scanner = new Scanner(System.in);
  static CommandsMap commandsMap = new CommandsMap();
  
  static String text = "\n0) Sair;";
  
  // * --- main ----------------------------------------------------------- * //

  public static void main(String[] args) throws Exception {    
    
    while (true) {
      System.out.println(commandsMap.getMenuText() + text);

      String action = scanner.nextLine();

      if (action.equals("0")) break;

      if (!action.equals("1") && !commandsMap.wasVectorCreated()) continue;

      if (!commandsMap.isCommandValid(action)) continue;


      commandsMap.executeCommand(action);

      System.out.println("\n\n");
    }
  }
}
