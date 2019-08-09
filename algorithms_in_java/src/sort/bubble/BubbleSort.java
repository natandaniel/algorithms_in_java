package sort.bubble;

import java.util.Arrays;

import sort.common.Sort;
import sort.common.ISort;

import static sort.common.Tools.*;

public class BubbleSort extends Sort implements ISort {

	public BubbleSort() {
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

			if (OPT_BUBBLE_SORT.equals(sortingAlgorithm)) {

				return optimisedBubbleSort(copy);

			} else {
				return bubbleSort(copy);
			}
		}

	}

	private Integer[] bubbleSort(Integer[] input) {

		for (int i = input.length - 1; 1 <= i; i--) {

			for (int j = 0; j <= i - 1; j++) {

				comparisonCount++;
				if (input[j + 1] < input[j]) {

					swapCount++;
					copyCount+=3;
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}

		return input;
	}

	private Integer[] optimisedBubbleSort(Integer[] input) {

		for (int i = input.length - 1; 1 <= i; i--) {

			boolean isSorted = true;

			for (int j = 0; j <= i - 1; j++) {

				comparisonCount++;

				if (input[j + 1] < input[j]) {

					swapCount++;
					copyCount+=3;
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;

					isSorted = false;
				}
			}

			if (isSorted) {
				break;
			}
		}

		return input;
	}
}
