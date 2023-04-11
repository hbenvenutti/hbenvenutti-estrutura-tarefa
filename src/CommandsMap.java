import java.util.HashMap;
import java.util.Map;

import modules.DataPresentation;
import modules.Insert;
import modules.Remove;
import modules.Search;
import modules.Seed;
import modules.Sort;

// * ---------------------------------------------------------------------- * //

public class CommandsMap {
  private int vectorLength = 10000;
  private int[] vector;
  
  private String menu = "\nEscolha uma função digitando um número:"
  + "\n01) Criar ou esvaziar o vetor;"
  + "\n02) Inserir um valor no vetor;"
  + "\n03) Apagar um valor do vetor;"
  + "\n04) Consultar se existe determinado valor no vetor;"
  + "\n05) Consultar quantos valores significativos ocupam o vetor;"
  + "\n06) Consultar qual o maior valor armazenado;"
  + "\n07) Consultar qual o menor valor armazenado;"
  + "\n08) Preencher o vetor com valores aleatórios ordenados;"
  + "\n09) Fazer uma busca binária;"
  + "\n10) Comparar buscas binária e linear;"
  + "\n11) Preencher o vetor com valores aleatórios não ordenados;"
  + "\n12) Ordenar o vetor;"
  + "\n13) Comparar os métodos de ordenação;"
  + "\n14) Listar os valores armazenados no vetor;";

  // * --- hashmap -------------------------------------------------------- * //

  private Map<String, Runnable> commands = new HashMap<>() {{
    this.put("1", () -> createVector());
    this.put("2", () -> Insert.addValueToArray(vector));
    this.put("3", () -> Remove.removeValue(vector));
    this.put("4", () -> Search.linearSearchCommand(vector));
    this.put("5", () -> DataPresentation.countValues(vector));
    this.put("6", () -> Search.findBiggest(vector));
    this.put("7", () -> Search.findLowest(vector));
    this.put("8", () -> Seed.SeedRandomOrdered(vector));
    this.put("9", () -> Search.binarySearchCommand(vector));
    this.put("10", () -> Search.compareSearches(vector));
    this.put("11", () -> Seed.seedRandom(vector));
    this.put("12", () -> Sort.execute(vector));
    this.put("13", () -> Sort.compareSortMethods(vector));
    this.put("14", () -> DataPresentation.listArray(vector));
  }};

  // * --- methods -------------------------------------------------------- * //

  public boolean wasVectorCreated() {
    if (vector != null) return true;
    
    System.err.println("O vetor não foi iniciado!");
    return false;
  }

  // ------------------------------------------------------------------------ //

  public String getMenuText() {
    return this.menu;
  }

  // ------------------------------------------------------------------------ //

  public boolean isCommandValid(String command) {
    Runnable value = this.commands.get(command);

    if (value != null) return true;

    System.out.println("Comando inválido!\n");

    return false;
  }

  // ------------------------------------------------------------------------ //

  public void executeCommand(String command) {
    this.commands.get(command).run();

    return;
  }

  // ------------------------------------------------------------------------ //

  private void createVector() {
    this.vector = new int[vectorLength];
    System.err.println("Vetor criado/recriado com sucesso!");

    return;
  };


}
