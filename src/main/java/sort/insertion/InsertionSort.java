package sort.insertion;

import java.util.Objects;

/**
 * Provides an implementation of the insertion sort algorithm applied to integers.</br>
 * Values can be sorted in both ascending and descending orders.
 * <p>
 * Time complexity : between O(N) (best case) and O(N^2) (worst case).
 */
class InsertionSort {

  private InsertionSort() {}

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

    for (int j = 1; j < input.length; j++) {
      int key = input[j];
      int i = j - 1;

      while (-1 < i && (isSortInAscendingOrder ? key < input[i] : input[i] < key))
        input[i + 1] = input[i--];

      input[i + 1] = key;
    }
  }

}
