package sort.insertion;

import java.util.Objects;

class InsertionSort {

  private InsertionSort() {}

  static void incrementalSort(double[] input) {
    Objects.requireNonNull(input);

    for (int j = 1; j < input.length; j++) {
      double key = input[j];
      int i = j - 1;

      while (-1 < i && key < input[i])
        input[i + 1] = input[i--];

      input[i + 1] = key;
    }
  }

  static void recursiveSort(double[] input, int startIndex, int endIndex) {
    Objects.requireNonNull(input);

    if (startIndex < endIndex) {
      int endIndex2 = endIndex - 1;
      recursiveSort(input, startIndex, endIndex2);

      double key = input[endIndex];
      int i = endIndex2;

      while (startIndex <= i && key < input[i])
        input[i + 1] = input[i--];

      input[i + 1] = key;
    }
  }

}
