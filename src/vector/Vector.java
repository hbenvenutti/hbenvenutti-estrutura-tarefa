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
    Output.print("Digite o tamanho do vetor: ");
    int length = Input.integer();
    
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

  private Boolean IndexIsValid(int index) {
    return index < 0 || index > this.length - 1;
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
    Find.lowest(clone);

    Output.print("O menor valor é: " + clone);
    return;
  }
  
  // ------------------------------------------------------------------------ //

  public void showGreatest() {
    int[] clone = this.cloneVector();

    Find.greatest(clone);
    Output.print("O maior valor é: " + clone);
    return;
  }

  // ------------------------------------------------------------------------ //

  public void list() {
    List.execute(vector);
    return;
  }

  // ------------------------------------------------------------------------ //

  public void insert() {
    Output.print("Digite o valor a ser inserido: ");
    int value = Input.integer();

    Output.print("Digite a posição a ser inserida: ");
    int index = Input.integer();

    if (!IndexIsValid(index)) {
      handleInvalidIndex();
      return ;
    }

    Insert.insertIndex(vector, value, index);
    this.sorted = false;
  }

  // ------------------------------------------------------------------------ //

  public void deleteByValue() {
    Output.print("Digite o valor a ser removido: ");
    int value = Input.integer();

    Delete.byValue(vector, value);

    this.sorted = false;
  }

  // ------------------------------------------------------------------------ //

  public void deleteByIndex() {
    Output.print("Digite a posição a ser removida: ");
    int index = Input.integer();

    if (!IndexIsValid(index)) {
      handleInvalidIndex();
      return ;
    }
    
    Delete.byIndex(vector, index);

    this.sorted = false;
  }

  // ------------------------------------------------------------------------ //

  public void linearSearch() {
    Output.print("Digite o valor a ser buscado: ");
    int value = Input.integer();

    int position = LinearSearch.execute(vector, value);

    if (position < 0) {
      Output.print("Valor não encontrado no vetor");
      return;
    }

    Output.print("Valor encontrado na posição " + position);
    return;
  }

  // ------------------------------------------------------------------------ //

  public void binarySearch() {
    int[] clone = this.cloneVector();

    Output.print("Digite o valor a ser buscado: ");
    int value = Input.integer();

    int position = BinarySearch.execute(clone, value, 0, length);

    if (position < 0) {
      Output.print("Valor não encontrado no vetor");
      return;
    }

    Output.print("Valor encontrado na posição " + position);
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
