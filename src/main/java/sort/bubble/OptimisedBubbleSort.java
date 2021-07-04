package sort.bubble;

import sort.common.Sort;

public class OptimisedBubbleSort extends Sort {

	public OptimisedBubbleSort() {
		super();
	}

	@Override
	protected Integer[] sortArray(Integer[] input) {

		for (int i = input.length - 1; 1 <= i; i--) {
			instructionCount++;

			instructionCount++;
			boolean isSorted = true;

			for (int j = 0; j <= i - 1; j++) {
				instructionCount++;

				instructionCount++;
				if (input[j + 1] < input[j]) {

					instructionCount += 4;
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					isSorted = false;
				}
			}
			instructionCount++; // adding final inner for loop test to the instruction count

			instructionCount++;
			if (isSorted) {
				instructionCount++;
				break;
			}
		}
		instructionCount++; // adding final outer for loop test to the instruction count

		return input;
	}
}
