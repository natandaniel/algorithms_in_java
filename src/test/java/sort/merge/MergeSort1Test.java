package sort.merge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sort.TestData;

public class MergeSort1Test {
  private static double[] randomOrderInput;
  private static double[] ascendingOrderInput;
  private static double[] descendingOrderInput;

  @BeforeClass
  public static void init() {
    randomOrderInput = Arrays.copyOf(TestData.INPUT, TestData.INPUT.length);
    ascendingOrderInput = Arrays.copyOf(TestData.INPUT_IN_ASCENDING_ORDER, TestData.INPUT_IN_ASCENDING_ORDER.length);
    descendingOrderInput = Arrays.copyOf(TestData.INPUT_IN_DESCENDING_ORDER, TestData.INPUT_IN_DESCENDING_ORDER.length);
  }

  @Test
  public void Given_ANullArray_When_Sorting_Then_ShouldThrowNullPointerException() {
    Assert.assertThrows(NullPointerException.class, () -> MergeSort.sort1(null));
  }

  @Test
  public void Given_InputNumbersInRandomOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    MergeSort.sort1(randomOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_IN_ASCENDING_ORDER, randomOrderInput, 0);
  }

  @Test
  public void Given_InputNumbersInAscendingOrder_When_SortingInput_Then_InputShouldRemainUnchanged() {
    MergeSort.sort1(ascendingOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_IN_ASCENDING_ORDER, ascendingOrderInput, 0);
  }

  @Test
  public void Given_InputNumberInDescendingOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    MergeSort.sort1(descendingOrderInput);
    Assert.assertArrayEquals(TestData.INPUT_IN_ASCENDING_ORDER, descendingOrderInput, 0);
  }

}
