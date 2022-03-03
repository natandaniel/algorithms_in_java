package sort.merge;

import java.util.Objects;

class MergeSort {

  private MergeSort() {}

  static void sort(int[] input) {
    Objects.requireNonNull(input);
    mergeSort(input, 0, input.length - 1);
  }

  private static void mergeSort(int[] input, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int midddleIndex = (startIndex + endIndex) / 2;
      mergeSort(input, startIndex, midddleIndex);
      mergeSort(input, midddleIndex + 1, endIndex);
      merge(input, startIndex, midddleIndex, endIndex);
    }
  }

  private static void merge(int[] input, int startIndex, int middleIndex, int endIndex) {
    int leftLength = middleIndex - startIndex + 1;
    int[] left = new int[leftLength];

    int rightLength = endIndex - middleIndex;
    int[] right = new int[rightLength];

    for (int i = 0; i < leftLength; i++)
      left[i] = input[startIndex + i];

    for (int i = 0; i < rightLength; i++)
      right[i] = input[middleIndex + 1 + i];

    int leftIndex = 0;
    int rightIndex = 0;

    for (int inputIndex = startIndex; inputIndex <= endIndex; inputIndex++) {
      if (leftIndex < leftLength) {
        int currentLeftValue = left[leftIndex];

        if (rightIndex < rightLength) {
          int currentRightValue = right[rightIndex];

          if (currentLeftValue <= currentRightValue) {
            input[inputIndex] = currentLeftValue;
            leftIndex++;
          }
          else {
            input[inputIndex] = currentRightValue;
            rightIndex++;
          }
        }
        else {
          input[inputIndex] = currentLeftValue;
          leftIndex++;
        }
      }
      else input[inputIndex] = right[rightIndex++];
    }
  }

}
