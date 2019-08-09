package sort.merge;

import sort.common.ISort;
import sort.common.Sort;

public class MergeSort extends Sort implements ISort {

	public MergeSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		comparisonCount++;
		if (input.length == 1) {
			return input;
		}

		Integer[] a = new Integer[input.length / 2];
		Integer[] b = new Integer[input.length - input.length / 2];

		for (int i = 0; i < input.length / 2; i++) {
			copyCount++;
			a[i] = input[i];
		}

		for (int i = 0; i < input.length - input.length / 2; i++) {
			copyCount++;
			b[i] = input[i + input.length / 2];
		}

		input = merge(sortArray(a), sortArray(b));
		return input;
	}

	private Integer[] merge(Integer[] a, Integer[] b) {

		Integer[] mergedArray = new Integer[a.length + b.length];

		int k = 0;
		int l = 0;

		for (int i = 0; i < mergedArray.length; i++) {
			comparisonCount++;
			if (k < a.length && l < b.length && a[k] < b[l]) {
				copyCount++;
				mergedArray[i] = a[k];
				k++;
				continue;
			}

			if (k < a.length && l < b.length && a[k] > b[l]) {
				copyCount++;
				mergedArray[i] = b[l];
				l++;
				continue;
			}

			if (k < a.length && l < b.length && a[k] == b[l]) {
				copyCount += 2;
				mergedArray[i] = a[k];
				mergedArray[i + 1] = b[l];
				l++;
				k++;
				i++;
				continue;
			}

			if (k == a.length && l < b.length) {
				copyCount++;
				mergedArray[i] = b[l];
				l++;
				continue;
			}

			if (l == b.length && k < a.length) {
				copyCount++;
				mergedArray[i] = a[k];
				k++;
				continue;
			}
		}

		return mergedArray;
	}
}
