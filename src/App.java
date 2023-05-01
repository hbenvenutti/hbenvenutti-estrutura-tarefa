import io.Input;

public class App {
  // * --- vars ----------------------------------------------------------- * //
  static final CommandsMap commandsMap = new CommandsMap();
  static final String exit = "\n0) Sair;";

  static final String menu = commandsMap.getMenu() + exit;
  
  // * --- main ----------------------------------------------------------- * //

  public static void main(String[] args) throws Exception {    
    boolean firstIteration = true;

    while (true) {
      if (!firstIteration) Input.string("\nTecle enter para continuar..");

      String action = Input.string(menu);
      firstIteration = false;
      
      if (action.equals("0")) break;
      
      if (!action.equals("1") && !commandsMap.wasVectorCreated()) continue;
      
      if (!commandsMap.isCommandValid(action)) continue;
      
      commandsMap.executeCommand(action);

    }
  }
}
