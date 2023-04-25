package random;

import java.util.Random;

import io.Output;

public class OrderedSeed {
  private static Random random = new Random();

  // * -------------------------------------------------------------------- * //

  public static void seed(int[] vector) {
    int step = 0;

    for (int i = 0; i < vector.length; i++) {
      int integer = Math.abs(random.nextInt(1000));
      vector[i] = step + integer;
      step = vector[i];
    }

    Output.print("Vetor populado com sucesso!");

    return;
  }
}
