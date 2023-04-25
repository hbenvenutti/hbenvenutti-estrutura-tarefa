package read;

import java.util.Arrays;
import java.util.Stack;

import io.Output;

public class List {

  public static void execute(int[] vector) {
    int length = vector.length;
    String warning = "OBS: "
    + "Vetores com tamanho maior que 50 terão os zeros removidos da listagem"
    ;

    Stack<Integer> stack = new Stack<Integer>();
  
    Output.print("Listagem do vetor:");
  
    for (int i = 0; i < vector.length; i++) {
      if (length > 50 && vector[i] == 0) continue;
  
      stack.push(vector[i]);
    }
    
    Output.print(Arrays.toString(stack.toArray()));
    Output.print(warning);
  }
}
