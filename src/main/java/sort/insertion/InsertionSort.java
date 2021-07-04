package sort.insertion;

/**
 * 
 * Utility class providing two methods for the insertion sort of an array of integers :
 * <ul>
 * <li>ascendingOrderSort : sorts numbers in ascending order</i>
 * <li>descendingOrderSort : sorts numbers in descending order</i>
 * </ul>
 * 
 * <p>
 * Time complexity : between O(N) and O(N^2)
 *
 */
class InsertionSort {

	private InsertionSort() {
	}

	static void ascendingOrderSort(int[] input) {
		for (int j = 1; j < input.length; j++) {
			int key = input[j];
			int i = j - 1;

			while (-1 < i && key < input[i]) {
				input[i + 1] = input[i];
				i--;
			}

			input[i + 1] = key;
		}
	}

	static void descendingOrderSort(int[] input) {
		for (int j = 1; j < input.length; j++) {
			int key = input[j];
			int i = j - 1;

			while (-1 < i && input[i] < key) {
				input[i + 1] = input[i];
				i--;
			}

			input[i + 1] = key;
		}
	}
}
