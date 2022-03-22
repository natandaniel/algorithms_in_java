package sort.merge;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

  @Test
  public void Given_ANullArray_When_Sorting_Then_ShouldThrowNullPointerException() {
    Assert.assertThrows(NullPointerException.class, () -> MergeSort.sort1(null));
    Assert.assertThrows(NullPointerException.class, () -> MergeSort.sort2(null));
  }

  @Test
  public void Given_ASingleInteger_When_Sorting_Then_ShouldGetInteger() {
    double[] input = new double[] { 1 };
    MergeSort.sort1(input);
    Assert.assertArrayEquals(new double[] { 1 }, input, 0);
    MergeSort.sort2(input);
    Assert.assertArrayEquals(new double[] { 1 }, input, 0);
  }

  @Test
  public void Given_Integers10To1_When_Sorting_Then_ShouldGetIntegers1To10() {
    double[] input1 = new double[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    double[] input2 = new double[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    MergeSort.sort1(input1);
    MergeSort.sort2(input2);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input1, 0);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input2, 0);
  }

  @Test
  public void Given_Integers1To10_When_Sorting_Then_ShouldGetIntegers1To10() {
    double[] input1 = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    double[] input2 = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    MergeSort.sort1(input1);
    MergeSort.sort2(input2);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input1, 0);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input2, 0);
  }

  @Test
  public void Given_10IntegersInRandomOrder_When_Sorting_Then_ShouldGetIntegers1To10() {
    double[] input1 = new double[] { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 };
    double[] input2 = new double[] { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 };
    MergeSort.sort1(input1);
    MergeSort.sort2(input2);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input1, 0);
    Assert.assertArrayEquals(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input2, 0);
  }

}
