package sort.insertion;

import sort.common.Sort;

public class InsertionSort extends Sort{

	public InsertionSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		for (int j = 1; j < input.length; j++) {
			instructionCount++;
			
			instructionCount+=2;
			int key = input[j];
			int i = j-1;
			
			while(0 <= i && key < input[i]) {
				instructionCount++;

				instructionCount+=2;
				input[i+1] = input[i];
				i--;
			}
			instructionCount++; // adding final inner while loop test to the instruction count
			
			instructionCount++;
			input[i+1] = key;
		}
		instructionCount++; // adding final outer for loop test to the instruction count

		return input;
	}
}
