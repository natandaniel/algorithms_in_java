package sort.selection;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void Given_AnArrayOfIntegers_When_SelectionSortingInAscendingOrder_Then_ShouldRearrangeArrayInAscendingOrder() {
		int[] input = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		SelectionSort.sort(input, true);
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, input);
	}

	@Test
	public void Given_AnArrayOfIntegers_When_SelectionSortingInDescendingOrder_Then_ShouldRearrangeArrayInDescendingOrder() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		SelectionSort.sort(input, false);
		Assert.assertArrayEquals(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, input);
	}

}
