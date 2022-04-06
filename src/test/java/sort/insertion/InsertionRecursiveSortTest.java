package sort.insertion;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import common.TestData;

public class InsertionRecursiveSortTest {
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
  public void Given_ANullArray_When_SortingInput_Then_ShouldThrowNullPointerException() {
    Assert.assertThrows(NullPointerException.class, () -> InsertionSort.recursiveSort(null, 0, 0));
  }

  @Test
  public void Given_InputNumbersInRandomOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    try {
      InsertionSort.recursiveSort(randomOrderInput, 0, randomOrderInput.length - 1);
      Assert.assertArrayEquals(TestData.INPUT_IN_ASCENDING_ORDER, randomOrderInput, 0);
    }
    catch (StackOverflowError e) {
      Assert.fail(e.getMessage());
    }
  }

  @Test
  public void Given_InputNumbersInAscendingOrder_When_SortingInput_Then_InputShouldRemainUnchanged() {
    try {
      InsertionSort.recursiveSort(ascendingOrderInput, 0, ascendingOrderInput.length - 1);
      Assert.assertArrayEquals(TestData.INPUT_IN_ASCENDING_ORDER, ascendingOrderInput, 0);
    }
    catch (StackOverflowError e) {
      Assert.fail(e.getMessage());
    }
  }

  @Test
  public void Given_InputNumberInDescendingOrder_When_SortingInput_Then_InputShouldBeSortedInAscendingOrder() {
    try {
      InsertionSort.recursiveSort(descendingOrderInput, 0, descendingOrderInput.length - 1);
      Assert.assertArrayEquals(TestData.INPUT_IN_ASCENDING_ORDER, descendingOrderInput, 0);
    }
    catch (StackOverflowError e) {
      Assert.fail(e.getMessage());
    }
  }

}
