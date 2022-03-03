package search.linear;

import java.util.OptionalInt;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {
  private static double[] INPUT = new double[30];

  static {
    for (int i = 0; i < INPUT.length; i++)
      INPUT[i] = i + 1;
  }

  @Test
  public void Given_IntegersFrom1To30_When_SearchingForValue24_Then_ReturnIndex23() {
    Assert.assertEquals(OptionalInt.of(23), LinearSearch.search(24, INPUT));
  }

  @Test
  public void Given_IntegersFrom1To30_When_SearchingForValue31_Then_ReturnOptionalEmpty() {
    Assert.assertEquals(OptionalInt.empty(), LinearSearch.search(31, INPUT));
  }

}
