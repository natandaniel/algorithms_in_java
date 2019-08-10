package sort.bubble;

import sort.common.Sort;

public class BubbleSort extends Sort{

	public BubbleSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		for (int i = input.length - 1; 1 <= i; i--) {
			instructionCount++;

			for (int j = 0; j <= i - 1; j++) {
				instructionCount++;

				instructionCount++;
				if (input[j + 1] < input[j]) {

					instructionCount+=3;
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
			instructionCount++; // adding final inner for loop test to the instruction count
		}
		instructionCount++; // adding final outer for loop test to the instruction count

		return input;
	}
}
