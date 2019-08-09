package sort.selection;

import sort.common.Sort;

public class SelectionSort extends Sort{

	public SelectionSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

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
				copyCount += 3;
				int temp = input[i - 1];
				input[i - 1] = input[indexSmallest];
				input[indexSmallest] = temp;
			} else if (input[indexSmallest] == input[i - 1]) {
				swapCount++;
				copyCount += 3;
				int temp = input[i];
				input[i] = input[indexSmallest];
				input[indexSmallest] = temp;
			}
		}

		return input;
	}
}
