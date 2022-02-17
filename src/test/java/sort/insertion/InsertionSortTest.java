package sort.insertion;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void Given_AnArrayOfIntegers_When_InsertionSortingInAscendingOrder_Then_ShouldRearrangeArrayInAscendingOrder() {
		int[] input = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		InsertionSort.sort(input, true);
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input);
	}

	@Test
	public void Given_AnArrayOfIntegers_When_InsertionSortingInDescendingOrder_Then_ShouldRearrangeArrayInDescendingOrder() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		InsertionSort.sort(input, false);
		Assert.assertArrayEquals(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, input);
	}

}
