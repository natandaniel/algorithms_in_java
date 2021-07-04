package sort.quick;

import sort.common.Sort;

public class QuickSort extends Sort{

	public QuickSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		quickSort(input, 0, input.length - 1);

		return input;
	}

	private void quickSort(Integer[] input, int firstIndex, int lastIndex) {

		instructionCount++;
		if (firstIndex < lastIndex) {
			instructionCount+=3;
			int pivotIndex = partitionArray(input, firstIndex, lastIndex);
			quickSort(input, firstIndex, pivotIndex - 1);
			quickSort(input, pivotIndex + 1, lastIndex);
		}
	}

	private int partitionArray(Integer[] array, int p, int r) {

		instructionCount+=2;
		int pivotValue = array[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {
			instructionCount++;
			
			instructionCount++;
			if (array[j] <= pivotValue) {
				
				instructionCount+=2;
				i++;
				if (i != j) {
					instructionCount+=3;
					int save = array[i];
					array[i] = array[j];
					array[j] = save;
				}
			}
		}
		instructionCount++; // adding final for loop test to the instruction count

		instructionCount++;
		if (i + 1 != r) {
			instructionCount+=3;
			int save = array[i + 1];
			array[i + 1] = pivotValue;
			array[r] = save;
		}

		instructionCount++;
		return i + 1;
	}
}
