package sort.merge;

import java.util.Objects;

/**
 * 
 * Provides an implementation of the merge sort algorithm.
 * <p>
 * Time complexity : O(N*log(N)).
 *
 */
class MergeSort {

	private MergeSort() {
	}

	/**
	 * Sorts the input array in ascending or descending order.
	 * 
	 * @param input                  an integer array, must not be null
	 * @param isSortInAscendingOrder if true, sorts the input array in ascending
	 *                               order, otherwise in descending order
	 */
	static void sort(int[] input, boolean isSortInAscendingOrder) {
		Objects.requireNonNull(input);

		if (input.length <= 1)
			return;

		mergeSort(input, 0, input.length - 1, isSortInAscendingOrder);
	}

	private static void mergeSort(int[] input, int p, int r, boolean isSortInAscendingOrder) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(input, p, q, isSortInAscendingOrder);
			mergeSort(input, q + 1, r, isSortInAscendingOrder);
			merge(input, p, q, r, isSortInAscendingOrder);
		}
	}

	private static void merge(int[] input, int p, int q, int r, boolean isSortInAscendingOrder) {
		int[] left = new int[q - p + 1];
		int[] right = new int[r - q];

		for (int i = 0; i < left.length; i++)
			left[i] = input[p + i];

		for (int i = 0; i < right.length; i++)
			right[i] = input[q + 1 + i];

		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k++) {
			if (j == right.length
					|| i < left.length && (isSortInAscendingOrder ? left[i] <= right[j] : left[i] >= right[j])) {
				input[k] = left[i];
				i++;
			} else if (i == left.length
					|| j < right.length && (isSortInAscendingOrder ? right[i] <= left[j] : right[i] >= left[j])) {
				input[k] = right[j];
				j++;
			}
		}
	}
}
