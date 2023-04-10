import java.util.HashMap;
import java.util.Map;

// * ---------------------------------------------------------------------- * //

public class CommandsMap {
  private int vectorLength = 10000;
  private int[] vector;

  private String menu = "\nEscolha uma função digitando um número:"
  + "\n1) Criar ou esvaziar o vetor;"
  + "\n2) Inserir um valor no vetor;"
  + "\n3) Apagar um valor do vetor;"
  + "\n4) Consultar se existe determinado valor no vetor;"
  + "\n5) Consultar quantos valores significativos ocupam o vetor;"
  + "\n6) Consultar qual o maior valor armazenado;"
  + "\n7) Consultar qual o menor valor armazenado;"
  + "\n8) Popular o vetor com valores aleatórios;"
  + "\n9) Fazer uma busca binária;"
  + "\n10) Comparar buscas binária e linear;"
  + "\n11) Listar os valores armazenados no vetor;";


  // * --- functions ------------------------------------------------------ * //
  public boolean wasVectorCreated() {
    if (vector != null) return true;
    
    System.err.println("O vetor não foi iniciado!");
    return false;
  }

  // ------------------------------------------------------------------------ //

  public String getMenuText() {
    return this.menu;
  }

  public boolean isCommandValid(String command) {
    Runnable value = this.commandsMap.get(command);

    if (value != null) return true;

    System.out.println("Comando inválido!\n");

    return false;
  }

  // ------------------------------------------------------------------------ //

  public void executeCommand(String command) {
    this.commandsMap.get(command).run();

    return;
  }

  // ------------------------------------------------------------------------ //

  private void createVector() {
    this.vector = new int[vectorLength];

    return;
  };

  // * --- hashmap -------------------------------------------------------- * //

  private Map<String, Runnable> commandsMap = new HashMap<>() {{
    this.put("1", () -> createVector());
    this.put("2", () -> Commands.addValueToArray(vector));
    this.put("3", () -> Commands.removeValueFromArray(vector));
    this.put("4", () -> Commands.findValueInArrayCommand(vector));
    this.put("5", () -> Commands.countValues(vector));
    this.put("6", () -> Commands.biggestValue(vector));
    this.put("7", () -> Commands.lowestValue(vector));
    this.put("8", () -> CommandsV2.SeedVectorWithRandom(vector));
    this.put("9", () -> CommandsV2.binarySearchCommand(vector));
    this.put("10", () -> CommandsV2.compareSearch(vector));
    this.put("11", () -> Commands.listArray(vector));
  }};
}
