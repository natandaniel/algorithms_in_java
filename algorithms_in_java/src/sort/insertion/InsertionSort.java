package sort.insertion;

import java.util.Arrays;

import sort.common.Sort;
import sort.common.ISort;

public class InsertionSort extends Sort implements ISort {

	public InsertionSort() {
		super();
	}

	@Override
	public Integer[] sort(Integer[] input, String sortingAlgorithm) throws Exception {

		comparisonCount = 0;
		swapCount = 0;
		copyCount = 0;

		if (input == null) {

			throw new Exception("Null input array -> nothing to sort");

		} else if (input.length == 0) {

			throw new Exception("Empty input array -> nothing to sort");

		} else if (input.length == 1) {
			return input;

		} else {

			final int N = input.length;
			Integer[] copy = Arrays.copyOf(input, N);

			return insertionSort(copy);
		}
	}

	private Integer[] insertionSort(Integer[] input) {

		for (int i = 0; i < input.length - 1; i++) {

			int j = i + 1;
			comparisonCount++;
			while (j > 0 && input[j] < input[j - 1]) {

				swapCount++;
				copyCount+=3;
				int temp = input[j - 1];
				input[j - 1] = input[j];
				input[j] = temp;
				j = j - 1;
			}
		}

		return input;
	}
}
