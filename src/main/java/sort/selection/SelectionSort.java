package sort.selection;

import sort.common.Sort;

public class SelectionSort extends Sort{

	public SelectionSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		for (int i = 1; i < input.length; i++) {
			instructionCount++;

			instructionCount++;
			int indexSmallest = i;

			for (int j = i + 1; j < input.length; j++) {
				instructionCount++;
				
				instructionCount++;
				if (input[indexSmallest] > input[j]) {
					instructionCount++;
					indexSmallest = j;
				}
			}
			instructionCount++; // adding final inner for loop test to the instruction count

			instructionCount++;
			if (input[indexSmallest] < input[i - 1]) {
				instructionCount+=3;
				int temp = input[i - 1];
				input[i - 1] = input[indexSmallest];
				input[indexSmallest] = temp;
			} else if (input[indexSmallest] == input[i - 1]) {
				instructionCount+=3;
				int temp = input[i];
				input[i] = input[indexSmallest];
				input[indexSmallest] = temp;
			}
		}
		instructionCount++; // adding final outer for loop test to the instruction count

		return input;
	}
}
