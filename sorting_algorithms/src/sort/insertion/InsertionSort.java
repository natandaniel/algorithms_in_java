package sort.insertion;

import sort.common.ISort;
import sort.common.Sort;

public class InsertionSort extends Sort implements ISort {

	public InsertionSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		for (int i = 0; i < input.length - 1; i++) {

			int j = i + 1;
			comparisonCount++;
			while (j > 0 && input[j] < input[j - 1]) {

				swapCount++;
				copyCount += 3;
				int temp = input[j - 1];
				input[j - 1] = input[j];
				input[j] = temp;
				j = j - 1;
			}
		}

		return input;
	}
}
