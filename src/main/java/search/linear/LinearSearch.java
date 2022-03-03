package search.linear;

import java.util.Objects;
import java.util.OptionalInt;

class LinearSearch {

  private LinearSearch() {}

  static OptionalInt search(double value, double[] input) {
    Objects.requireNonNull(input);

    for (int i = 0; i < input.length; i++)
      if (input[i] == value) return OptionalInt.of(i);

    return OptionalInt.empty();
  }

}
