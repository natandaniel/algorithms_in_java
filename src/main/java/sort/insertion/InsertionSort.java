package sort.insertion;

/**
 * 
 * Provides an implementation of the insertion sort algorithm.
 * <p>
 * Time complexity : between O(N) and O(N^2).
 *
 */
class InsertionSort {

	private InsertionSort() {
	}

	/**
	 * Sorts the input array in ascending or descending order.
	 * 
	 * @param input                  an integer array, must not be null
	 * @param isSortInAscendingOrder if true, sorts the input array in ascending
	 *                               order, otherwise in descending order
	 */
	static void sort(int[] input, boolean isSortInAscendingOrder) {
		for (int j = 1; j < input.length; j++) {
			int key = input[j];
			int i = j - 1;

			while (-1 < i && (isSortInAscendingOrder ? key < input[i] : input[i] < key)) {
				input[i + 1] = input[i];
				i--;
			}

			input[i + 1] = key;
		}
	}

}
