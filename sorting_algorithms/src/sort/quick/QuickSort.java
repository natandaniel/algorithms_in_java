package sort.quick;

import sort.common.ISort;
import sort.common.Sort;

public class QuickSort extends Sort implements ISort {

	public QuickSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		quickSort(input, 0, input.length - 1);

		return input;
	}

	private void quickSort(Integer[] input, int firstIndex, int lastIndex) {

		comparisonCount++;
		if (firstIndex < lastIndex) {
			int pivotIndex = partitionArray(input, firstIndex, lastIndex);
			quickSort(input, firstIndex, pivotIndex - 1);
			quickSort(input, pivotIndex + 1, lastIndex);
		}
	}

	private int partitionArray(Integer[] array, int p, int r) {

		int pivotValue = array[r];

		int i = p - 1;

		for (int j = p; j < r; j++) {
			comparisonCount++;
			if (array[j] <= pivotValue) {
				i++;
				if (i != j) {
					swapCount++;
					copyCount += 3;
					int save = array[i];
					array[i] = array[j];
					array[j] = save;
				}
			}
		}

		if (i + 1 != r) {
			swapCount++;
			copyCount += 3;
			int save = array[i + 1];
			array[i + 1] = pivotValue;
			array[r] = save;
		}

		return i + 1;

	}
}
