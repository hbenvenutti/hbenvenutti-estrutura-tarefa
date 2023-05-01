package vector;

import io.Input;
import io.Output;
import random.OrderedSeed;
import random.Seed;
import read.Count;
import read.Find;
import read.List;
import search.BinarySearch;
import search.LinearSearch;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.QuickSort;
import sort.SelectionSort;
import write.Delete;
import write.Insert;

// * ---------------------------------------------------------------------- * //

public class Vector {
  private int[] vector;
  private int length;
  private Boolean sorted = false;

  private int[] cloneVector() {
    int[] clone = this.vector.clone();

    QuickSort.sort(clone);

    return clone;
  }

  // * --- set/get -------------------------------------------------------- * //
  public void setVector() {
    int length = Input.integer("Digite o tamanho do vetor: ");
    
    if (length <= 0) return;
    
    this.vector = new int[length]; // ? o java já instancia o vetor com zeros.
    this.length = length;
    return;
  }

  // ------------------------------------------------------------------------ //

  public int[] getVector() {
    return vector;
  }

  // ------------------------------------------------------------------------ //

  public Boolean isSorted() {
    return sorted;
  }

  // * --- interns -------------------------------------------------------- * //

  // private void handleVectorNotSorted() {
  //   Output.printError("O vetor não está ordenado");
  // }

  // ------------------------------------------------------------------------ //

  private  void handleInvalidIndex() {
    Output.printError("Posição inválida");
  }

  // ------------------------------------------------------------------------ //

  private Boolean indexIsValid(int index) {
    return index >= 0 && index < this.length;
  }

  // * --- methods -------------------------------------------------------- * //
  public void seed() {
    Seed.seed(this.vector);
    this.sorted = false;
    return;
  }

  // ------------------------------------------------------------------------ //

  public void seedOrdered() {
    OrderedSeed.seed(this.vector);
    this.sorted = true;
    return;
  }

  // ------------------------------------------------------------------------ //
  public void countValid() {
    int[] clone = this.cloneVector();

    Count.valid(clone);
    return;
  }

  // ------------------------------------------------------------------------ //

  public void showLowest() {
    int[] clone = this.cloneVector();
    int value = Find.lowest(clone);

    Output.print("O menor valor é: " + value);
    return;
  }
  
  // ------------------------------------------------------------------------ //

  public void showGreatest() {
    int[] clone = this.cloneVector();

    int value = Find.greatest(clone);
    Output.print("O maior valor é: " + value);
    return;
  }

  // ------------------------------------------------------------------------ //

  public void list() {
    List.execute(vector);
    return;
  }

  // ------------------------------------------------------------------------ //

  public void insert() {
    int value = Input.integer("Digite o valor a ser inserido: ");

    int index = Input.integer("Digite a posição a ser inserida: ");

    if (!indexIsValid(index)) {
      handleInvalidIndex();
      return ;
    }

    Insert.insertIndex(vector, value, index);
    this.sorted = false;
  }

  // ------------------------------------------------------------------------ //

  public void deleteByValue() {
    int value = Input.integer("Digite o valor a ser removido: ");

    Delete.byValue(vector, value);

    this.sorted = false;
  }

  // ------------------------------------------------------------------------ //

  public void deleteByIndex() {
    int index = Input.integer("Digite a posição a ser removida: ");

    if (!indexIsValid(index)) {
      handleInvalidIndex();
      return ;
    }
    
    Delete.byIndex(vector, index);

    this.sorted = false;
  }

  // ------------------------------------------------------------------------ //

  public void linearSearch() {
    int value = Input.integer("Digite o valor a ser buscado: ");

    int position = LinearSearch.execute(vector, value);

    if (position < 0) {
      Output.print("Valor não encontrado no vetor");
      return;
    }

    Output.print("Valor encontrado na posição: " + position);
    return;
  }

  // ------------------------------------------------------------------------ //

  public void binarySearch() {
    int[] clone = this.cloneVector();

    int value = Input.integer("Digite o valor a ser buscado: ");

    int position = BinarySearch.search(clone, value);

    if (position < 0) {
      Output.print("Valor não encontrado no vetor");
      return;
    }

    Output.print("Valor encontrado na posição: " + position);
    return;
  }

  // ------------------------------------------------------------------------ //
  
  public void bubblesort() {
    BubbleSort.sort(vector);

    this.sorted = true;
    return;
  }

  // ------------------------------------------------------------------------ //

  public void insertionSort() {
    InsertionSort.execute(vector);
    this.sorted = true;
    return;
  }

  // ------------------------------------------------------------------------ //

  public void selectionSort() {
    SelectionSort.execute(vector);
    this.sorted = true;
    return;
  }

  // ------------------------------------------------------------------------ //

  public void quicksort() {
    QuickSort.sort(vector);
    this.sorted = true;
    return;
  }
}
