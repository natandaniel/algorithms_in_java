package sort.merge;

import java.util.Objects;

class MergeSort {

  private MergeSort() {}

  static void sort1(double[] input) {
    Objects.requireNonNull(input);
    mergeSort1(input, 0, input.length - 1);
  }

  static void sort2(double[] input) {
    Objects.requireNonNull(input);
    mergeSort2(input, 0, input.length - 1);
  }

  private static void mergeSort1(double[] input, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int midddleIndex = (startIndex + endIndex) / 2;
      mergeSort1(input, startIndex, midddleIndex);
      mergeSort1(input, midddleIndex + 1, endIndex);
      merge1(input, startIndex, midddleIndex, endIndex);
    }
  }

  private static void mergeSort2(double[] input, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int midddleIndex = (startIndex + endIndex) / 2;
      mergeSort2(input, startIndex, midddleIndex);
      mergeSort2(input, midddleIndex + 1, endIndex);
      merge2(input, startIndex, midddleIndex, endIndex);
    }
  }

  private static void merge1(double[] input, int startIndex, int middleIndex, int endIndex) {
    int firstHalfLength = middleIndex - startIndex + 1;
    double[] left = new double[firstHalfLength + 1];

    for (int i = 0; i < firstHalfLength; i++)
      left[i] = input[startIndex + i];

    left[firstHalfLength] = Double.POSITIVE_INFINITY;

    int secondHalfLength = endIndex - middleIndex;
    double[] right = new double[secondHalfLength + 1];

    for (int i = 0; i < secondHalfLength; i++)
      right[i] = input[middleIndex + 1 + i];

    right[secondHalfLength] = Double.POSITIVE_INFINITY;

    int firstHalfIndex = 0;
    int secondHalfIndex = 0;

    for (int inputIndex = startIndex; inputIndex <= endIndex; inputIndex++) {
      if (left[firstHalfIndex] <= right[secondHalfIndex]) input[inputIndex] = left[firstHalfIndex++];
      else input[inputIndex] = right[secondHalfIndex++];
    }
  }

  private static void merge2(double[] input, int startIndex, int middleIndex, int endIndex) {
    int firstHalfLength = middleIndex - startIndex + 1;
    double[] left = new double[firstHalfLength];

    for (int i = 0; i < firstHalfLength; i++)
      left[i] = input[startIndex + i];

    int secondHalfLength = endIndex - middleIndex;
    double[] right = new double[secondHalfLength];

    for (int i = 0; i < secondHalfLength; i++)
      right[i] = input[middleIndex + 1 + i];

    int firstHalfIndex = 0;
    int secondHalfIndex = 0;

    for (int inputIndex = startIndex; inputIndex <= endIndex; inputIndex++) {
      if (secondHalfIndex == secondHalfLength || (firstHalfIndex < firstHalfLength && left[firstHalfIndex] <= right[secondHalfIndex])) input[inputIndex] = left[firstHalfIndex++];
      else input[inputIndex] = right[secondHalfIndex++];
    }
  }

}
