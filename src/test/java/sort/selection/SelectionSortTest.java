package sort.selection;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import common.TestData;

public class SelectionSortTest {
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
  public void Given_ANullArray_When_Sorting_Then_ShouldThrowNullPointerException() {
    Assert.assertThrows(NullPointerException.class, () -> SelectionSort.sort(null));
  }

  @Test
  public void Given_InputNumbersInRandomOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    SelectionSort.sort(randomOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_5K_NUMBERS_ASCENDING, randomOrderInput, 0);
  }

  @Test
  public void Given_InputNumbersInAscendingOrder_When_SortingInput_Then_InputShouldRemainUnchanged() {
    SelectionSort.sort(ascendingOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_5K_NUMBERS_ASCENDING, ascendingOrderInput, 0);
  }

  @Test
  public void Given_InputNumberInDescendingOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    SelectionSort.sort(descendingOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_5K_NUMBERS_ASCENDING, descendingOrderInput, 0);
  }

}
