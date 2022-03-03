package sort.merge;

import java.util.Objects;

class MergeSort {

  private MergeSort() {}

  static void sort(double[] input) {
    Objects.requireNonNull(input);
    mergeSort(input, 0, input.length - 1);
  }

  private static void mergeSort(double[] input, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int midddleIndex = (startIndex + endIndex) / 2;
      mergeSort(input, startIndex, midddleIndex);
      mergeSort(input, midddleIndex + 1, endIndex);
      merge(input, startIndex, midddleIndex, endIndex);
    }
  }

  private static void merge(double[] input, int startIndex, int middleIndex, int endIndex) {
    int lengthOfFirstHalf = middleIndex - startIndex + 1;
    double[] firstHalf = new double[lengthOfFirstHalf + 1];

    for (int i = 0; i < lengthOfFirstHalf; i++)
      firstHalf[i] = input[startIndex + i];

    firstHalf[lengthOfFirstHalf] = Double.POSITIVE_INFINITY;

    int lengthOfSecondHalf = endIndex - middleIndex;
    double[] secondHalf = new double[lengthOfSecondHalf + 1];

    for (int i = 0; i < lengthOfSecondHalf; i++)
      secondHalf[i] = input[middleIndex + 1 + i];

    secondHalf[lengthOfSecondHalf] = Double.POSITIVE_INFINITY;

    int firstHalfIndex = 0;
    int secondHalfIndex = 0;

    for (int inputIndex = startIndex; inputIndex <= endIndex; inputIndex++) {
      if (firstHalf[firstHalfIndex] <= secondHalf[secondHalfIndex]) input[inputIndex] = firstHalf[firstHalfIndex++];
      else input[inputIndex] = secondHalf[secondHalfIndex++];
    }
  }

}
