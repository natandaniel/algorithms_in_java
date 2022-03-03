package sort.insertion;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

  @Test
  public void Given_ANullArray_When_Sorting_Then_ShouldThrowNullPointerException() {
    Assert.assertThrows(NullPointerException.class, () -> InsertionSort.sort(null));
  }

  @Test
  public void Given_ASingleInteger_When_Sorting_Then_ShouldGetInteger() {
    int[] input = new int[] { 1 };
    InsertionSort.sort(input);
    Assert.assertArrayEquals(new int[] { 1 }, input);
  }

  @Test
  public void Given_Integers10To1_When_Sorting_Then_ShouldGetIntegers1To10() {
    int[] input = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    InsertionSort.sort(input);
    Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input);
  }

  @Test
  public void Given_Integers1To10_When_Sorting_Then_ShouldGetIntegers1To10() {
    int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    InsertionSort.sort(input);
    Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input);
  }

  @Test
  public void Given_10IntegersInRandomOrder_When_Sorting_Then_ShouldGetIntegers1To10() {
    int[] input = new int[] { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 };
    InsertionSort.sort(input);
    Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input);
  }

}
