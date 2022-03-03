package sort.selection;

import java.util.Objects;

class SelectionSort {

  private SelectionSort() {}

  static void sort(double[] input) {
    Objects.requireNonNull(input);

    int length = input.length;

    for (int j = 0; j < length - 1; j++) {
      int minimumNumberIndex = j;

      for (int i = j + 1; i < length; i++)
        if (input[i] < input[minimumNumberIndex]) minimumNumberIndex = i;

      double key = input[j];
      input[j] = input[minimumNumberIndex];
      input[minimumNumberIndex] = key;
    }
  }

}
