package search.linear;

import java.util.Objects;

class LinearSearch {

  private LinearSearch() {}

  static int search(double value, double[] input) {
    Objects.requireNonNull(input);

    for (int i = 0; i < input.length; i++)
      if (Double.compare(input[i], value) == 0) return i;

    return -1;
  }

}
