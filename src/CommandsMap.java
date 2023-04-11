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
  + "\n1) Criar ou esvaziar o vetor;"
  + "\n2) Inserir um valor no vetor;"
  + "\n3) Apagar um valor do vetor;"
  + "\n4) Consultar se existe determinado valor no vetor;"
  + "\n5) Consultar quantos valores significativos ocupam o vetor;"
  + "\n6) Consultar qual o maior valor armazenado;"
  + "\n7) Consultar qual o menor valor armazenado;"
  + "\n8) Preencher o vetor com valores aleatórios ordenados;"
  + "\n9) Fazer uma busca binária;"
  + "\n10) Comparar buscas binária e linear;"
  + "\n11) Preencher o vetor com valores aleatórios não ordenados;"
  + "\n12) Ordenar o vetor;"
  + "\n13) Listar os valores armazenados no vetor;";

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
    this.put("12", () -> Sort.sortCommand(vector));
    this.put("13", () -> DataPresentation.listArray(vector));
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
