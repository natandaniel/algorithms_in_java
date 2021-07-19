package sort.selection;

/**
 * 
 * Provides an implementation of the selection sort algorithm.
 * <p>
 * Time complexity : O(N^2).
 *
 */
class SelectionSort {

	private SelectionSort() {
	}

	/**
	 * Sorts the input array in ascending or descending order.
	 * 
	 * @param input                  an integer array, must not be null
	 * @param isSortInAscendingOrder if true, sorts the input array in ascending
	 *                               order, otherwise in descending order
	 */
	static void sort(int[] input, boolean isSortInAscendingOrder) {
		int length = input.length;

		for (int j = 0; j < length - 1; j++) {
			int minOrMax = j;

			for (int i = j + 1; i < length; i++) {
				if (isSortInAscendingOrder ? input[i] < input[minOrMax] : input[minOrMax] < input[i])
					minOrMax = i;
			}

			int tmp = input[j];
			input[j] = input[minOrMax];
			input[minOrMax] = tmp;
		}
	}

}
