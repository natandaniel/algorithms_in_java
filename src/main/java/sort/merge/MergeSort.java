package sort.merge;

import java.util.Objects;

/**
 * Provides an implementation of the merge sort algorithm applied to an array of integers.</br>
 * Values can be sorted in both ascending and descending orders.
 * <p>
 * For an array of size N :
 * <ul>
 * <li>the time complexity is : O(N*log(N))</li>
 * <li>the space complexity is : O(N)</li>
 * </ul>
 */
class MergeSort {

  private MergeSort() {}

  /**
   * Sorts the input array of integers in ascending or descending order.
   * 
   * @param input
   *          an array of integers, must not be null
   * @param isSortInAscendingOrder
   *          if true, sorts the input array in ascending order, otherwise in descending order
   * @throws NullPointerException
   *           if input is null
   */
  static void sort(int[] input, boolean isSortInAscendingOrder) {
    Objects.requireNonNull(input);

    if (input.length <= 1) return;

    mergeSort(input, 0, input.length - 1, isSortInAscendingOrder);
  }

  /**
   * Does an in place merge sort of the specified input array from the specified start index to the end index.
   * 
   * @param input
   *          an array of integers, must not be null and must contain elements ranging from the specified start and end indices
   * @param startIndex
   *          an index defining the starting index of the range of numbers to sort, must be within the specified array's bounds
   * @param endIndex
   *          an index defining the ending index of the range of numbers to sort, must be within the specified array's bounds
   * @param isSortInAscendingOrder
   *          if true, sorts the input array in ascending order, otherwise in descending order
   */
  private static void mergeSort(int[] input, int startIndex, int endIndex, boolean isSortInAscendingOrder) {
    if (startIndex < endIndex) {
      int midddleIndex = (startIndex + endIndex) / 2;
      mergeSort(input, startIndex, midddleIndex, isSortInAscendingOrder);
      mergeSort(input, midddleIndex + 1, endIndex, isSortInAscendingOrder);
      merge(input, startIndex, midddleIndex, endIndex, isSortInAscendingOrder);
    }
  }

  private static void merge(int[] input, int startIndex, int middleIndex, int endIndex, boolean isSortInAscendingOrder) {
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

          if (isSortInAscendingOrder ? currentLeftValue <= currentRightValue : currentLeftValue >= currentRightValue) {
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
