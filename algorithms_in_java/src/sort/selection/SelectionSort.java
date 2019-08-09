package sort.selection;

import static sort.common.Tools.EMPTY_ARRAY_ERR_MSG;
import static sort.common.Tools.NULL_ARRAY_ERR_MSG;

import java.util.Arrays;

import sort.common.Sort;
import sort.common.ISort;

public class SelectionSort extends Sort implements ISort {

	public SelectionSort() {
		super();
	}

	@Override
	public Integer[] sort(Integer[] input, String sortingAlgorithm) throws Exception {

		comparisonCount = 0;
		swapCount = 0;
		copyCount = 0;

		if (input == null) {

			throw new Exception(NULL_ARRAY_ERR_MSG);

		} else if (input.length == 0) {

			throw new Exception(EMPTY_ARRAY_ERR_MSG);

		} else if (input.length == 1) {
			return input;

		} else {

			final int N = input.length;
			Integer[] copy = Arrays.copyOf(input, N);

			return selectSort(copy);
		}

	}

	private Integer[] selectSort(Integer[] input) {

		for (int i = 1; i < input.length; i++) {

			int indexSmallest = i;

			for (int j = i + 1; j < input.length; j++) {
				comparisonCount++;
				if (input[indexSmallest] > input[j]) {
					indexSmallest = j;
				}
			}

			comparisonCount++;
			if (input[indexSmallest] < input[i - 1]) {
				swapCount++;
				copyCount+=3;
				int temp = input[i - 1];
				input[i - 1] = input[indexSmallest];
				input[indexSmallest] = temp;
			} else if (input[indexSmallest] == input[i - 1]) {
				swapCount++;
				copyCount+=3;
				int temp = input[i];
				input[i] = input[indexSmallest];
				input[indexSmallest] = temp;
			}
		}

		return input;
	}
}
