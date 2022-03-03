package sort.selection;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

  @Test
  public void Given_ANullArray_When_Sorting_Then_ShouldThrowNullPointerException() {
    Assert.assertThrows(NullPointerException.class, () -> SelectionSort.sort(null));
  }

  @Test
  public void Given_ASingleInteger_When_Sorting_Then_ShouldGetInteger() {
    double[] input = new double[] { 1 };
    SelectionSort.sort(input);
    Assert.assertArrayEquals(new double[] { 1 }, input, 0);
  }

  @Test
  public void Given_Integers10To1_When_Sorting_Then_ShouldGetIntegers1To10() {
    double[] input = new double[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    SelectionSort.sort(input);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input, 0);
  }

  @Test
  public void Given_Integers1To10_When_Sorting_Then_ShouldGetIntegers1To10() {
    double[] input = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    SelectionSort.sort(input);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input, 0);
  }

  @Test
  public void Given_10IntegersInRandomOrder_When_Sorting_Then_ShouldGetIntegers1To10() {
    double[] input = new double[] { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 };
    SelectionSort.sort(input);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input, 0);
  }

}
