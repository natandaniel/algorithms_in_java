package sort.merge;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

	@Test
	public void Given_AnArrayOfIntegers_When_MergeSortingInAscendingOrder_Then_ShouldRearrangeArrayInAscendingOrder() {
		int[] input = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		MergeSort.sort(input, true);
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input);
	}

	@Test
	public void Given_AnArrayOfIntegers_When_MergeSortingInDescendingOrder_Then_ShouldRearrangeArrayInDescendingOrder() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		MergeSort.sort(input, false);
		Assert.assertArrayEquals(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, input);
	}

}
