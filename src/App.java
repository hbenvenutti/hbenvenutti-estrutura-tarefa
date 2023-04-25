import io.Input;
import io.Output;

public class App {
  // * --- vars ----------------------------------------------------------- * //
  static final CommandsMap commandsMap = new CommandsMap();
  static final String exit = "\n0) Sair;";

  static final String menu = commandsMap.getMenu() + exit;
  
  // * --- main ----------------------------------------------------------- * //

  public static void main(String[] args) throws Exception {    
    
    while (true) {
      Output.print(menu);

      String action = Input.string();

      if (!commandsMap.isCommandValid(action)) continue;

      if (action.equals("0")) break;

      if (!action.equals("1") && !commandsMap.wasVectorCreated()) continue;

      commandsMap.executeCommand(action);

      Output.print("");
    }
  }
}
