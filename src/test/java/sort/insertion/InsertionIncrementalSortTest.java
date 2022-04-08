package sort.insertion;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import common.TestData;

public class InsertionIncrementalSortTest {
  private static double[] randomOrderInput;
  private static double[] ascendingOrderInput;
  private static double[] descendingOrderInput;

  @BeforeClass
  public static void init() {
    randomOrderInput = Arrays.copyOf(TestData.INPUT_5K_NUMBERS, TestData.INPUT_5K_NUMBERS.length);
    ascendingOrderInput = Arrays.copyOf(TestData.INPUT_5K_NUMBERS_ASCENDING, TestData.INPUT_5K_NUMBERS_ASCENDING.length);
    descendingOrderInput = Arrays.copyOf(TestData.INPUT_5K_NUMBERS_DESCENDING, TestData.INPUT_5K_NUMBERS_DESCENDING.length);
  }

  @Test
  public void Given_ANullArray_When_SortingInput_Then_ShouldThrowNullPointerException() {
    Assert.assertThrows(NullPointerException.class, () -> InsertionSort.incrementalSort(null));
  }

  @Test
  public void Given_InputNumbersInRandomOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    InsertionSort.incrementalSort(randomOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_5K_NUMBERS_ASCENDING, randomOrderInput, 0);
  }

  @Test
  public void Given_InputNumbersInAscendingOrder_When_SortingInput_Then_InputShouldRemainUnchanged() {
    InsertionSort.incrementalSort(ascendingOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_5K_NUMBERS_ASCENDING, ascendingOrderInput, 0);
  }

  @Test
  public void Given_InputNumberInDescendingOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    InsertionSort.incrementalSort(descendingOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_5K_NUMBERS_ASCENDING, descendingOrderInput, 0);
  }

}
