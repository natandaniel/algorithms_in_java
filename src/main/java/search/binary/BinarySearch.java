package search.binary;

import java.util.Objects;

class BinarySearch {

  private BinarySearch() {}

  /**
   * Returns an index where the specified value is stored in the specified array if found, -1 otherwise.
   * 
   * @param value
   *          a value to search for
   * @param input
   *          the sequence of numbers in which to search for a value, must be sorted in ascending order
   * @return an index where the specified value is stored in the specified array if found, -1 otherwise.
   */
  static int iterativeSearch(double value, double[] input) {
    return iterativeSearch(value, Objects.requireNonNull(input), 0, input.length - 1);
  }

  /**
   * Returns an index where the specified value is stored in the specified array if found, -1 otherwise.
   * 
   * @param value
   *          a value to search for
   * @param input
   *          the sequence of numbers in which to search for a value, must be sorted in ascending order
   * @return an index where the specified value is stored in the specified array if found, -1 otherwise.
   */
  static int recursiveSearch(double value, double[] input) {
    return recursiveSearch(value, Objects.requireNonNull(input), 0, input.length - 1);
  }

  private static int iterativeSearch(double value, double[] input, int startIndex, int endIndex) {
    if (isInputIncorrect(input, startIndex, endIndex)) return -1;

    int a = startIndex;
    int b = endIndex;
    int m = (a + b) / 2;

    while (input[m] != value) {
      if (input[m] < value) a = m + 1;
      else b = m - 1;

      if (b < a) return -1;
      m = (a + b) / 2;
    }

    return m;
  }

  private static int recursiveSearch(double value, double[] input, int startIndex, int endIndex) {
    if (isInputIncorrect(input, startIndex, endIndex)) return -1;

    int a = startIndex;
    int b = endIndex;
    int m = (a + b) / 2;

    double middleValue = input[m];
    if (Double.compare(middleValue, value) == 0) return m;
    return middleValue < value ? recursiveSearch(value, input, m + 1, b) : recursiveSearch(value, input, a, m - 1);
  }

  private static boolean isInputIncorrect(double[] input, int startIndex, int endIndex) {
    boolean isEmptyOrNullInputArray = input == null || input.length == 0;
    boolean isStartIndexOutOfRange = startIndex < 0 || input.length <= startIndex;
    boolean isEndIndexOutOfRange = endIndex < 0 || input.length <= endIndex;
    boolean isStartIndexGreaterThanEndIndex = endIndex < startIndex;
    return isEmptyOrNullInputArray || isStartIndexOutOfRange || isEndIndexOutOfRange || isStartIndexGreaterThanEndIndex;
  }

}
