package sort.bubble;

import sort.common.Sort;

public class OptimisedBubbleSort extends Sort {

	public OptimisedBubbleSort() {
		super();
	}

	@Override
	protected Integer[] sortArray(Integer[] input) {

		for (int i = input.length - 1; 1 <= i; i--) {

			boolean isSorted = true;

			for (int j = 0; j <= i - 1; j++) {

				comparisonCount++;

				if (input[j + 1] < input[j]) {

					swapCount++;
					copyCount += 3;
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
