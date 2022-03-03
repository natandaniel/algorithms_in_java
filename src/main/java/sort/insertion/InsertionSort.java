package sort.insertion;

import java.util.Objects;

class InsertionSort {

  private InsertionSort() {}

  static void sort(double[] input) {
    Objects.requireNonNull(input);

    for (int j = 1; j < input.length; j++) {
      double key = input[j];
      int i = j - 1;

      while (-1 < i && key < input[i])
        input[i + 1] = input[i--];

      input[i + 1] = key;
    }
  }

}
