import java.util.HashMap;
import java.util.Map;

import io.Output;
import vector.Vector;

// * ---------------------------------------------------------------------- * //

public class CommandsMap {
  private Vector vector;

  public CommandsMap() {
    this.vector = new Vector();
  }
  
  private String menu = "\n"
  + "Escolha uma função digitando um número:"
  + "\n01) Criar um novo vetor;"
  + "\n02) Popular o vetor com números aleatórios;"
  + "\n03) Popular o vetor com números aleatórios ordenados;"
  + "\n04) Consultar quantos valores significativos ocupam o vetor;"
  + "\n05) Buscar o menor valor do vetor;"
  + "\n06) Buscar o maior valor do vetor;"
  + "\n07) Listar os valores do vetor;"
  + "\n08) Inserir um valor em uma posição;"
  + "\n09) Remover um valor do vetor;"
  + "\n10) Remover um valor de uma posição;"
  + "\n11) Buscar um valor linearmente;"
  + "\n12) Buscar um valor binariamente;"
  + "\n13) Ordenar o vetor usando Bubblesort;"
  + "\n14) Ordenar o vetor usando Insertionionsort;"
  + "\n15) Ordenar o vetor usando Selectionsort;"
  + "\n16) Ordenar o vetor usando Quicksort;";

  // * --- hashmap -------------------------------------------------------- * //

  private Map<String, Runnable> commands = new HashMap<>() {{
    this.put("1", () -> vector.setVector());
    this.put("2", () -> vector.seed());
    this.put("3", () -> vector.seedOrdered());
    this.put("4", () -> vector.countValid());
    this.put("5", () -> vector.showLowest());
    this.put("6", () -> vector.showGreatest());
    this.put("7", () -> vector.list());
    this.put("8", () -> vector.insert());
    this.put("9", () -> vector.deleteByValue());
    this.put("10", () -> vector.deleteByIndex());
    this.put("11", () -> vector.linearSearch());
    this.put("12", () -> vector.binarySearch());
    this.put("13", () -> vector.bubblesort());
    this.put("14", () -> vector.insertionSort());
    this.put("15", () -> vector.selectionSort());
    this.put("16", () -> vector.quicksort());
  }};

  // * --- methods -------------------------------------------------------- * //

  public boolean wasVectorCreated() {
    if (vector.getVector() != null) return true;
    
    Output.printError("O vetor não foi iniciado!");
    return false;
  }

  // ------------------------------------------------------------------------ //

  public String getMenu() {
    return this.menu;
  }

  // ------------------------------------------------------------------------ //

  public boolean isCommandValid(String command) {
    Runnable value = this.commands.get(command);
    
    if (value != null) return true;

    Output.printError("Comando inválido!");

    return false;
  }

  // ------------------------------------------------------------------------ //

  public void executeCommand(String command) {
    this.commands.get(command).run();

    return;
  }
}
