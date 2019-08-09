package sort.merge;

import static sort.common.Tools.EMPTY_ARRAY_ERR_MSG;
import static sort.common.Tools.NULL_ARRAY_ERR_MSG;

import java.util.Arrays;

import sort.common.Sort;
import sort.common.ISort;

public class MergeSort extends Sort implements ISort {
	
	public MergeSort() {
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

			return mergeSort(copy);
		}

	}
	
	private Integer[] mergeSort(Integer[] input) {

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

		input = merge(mergeSort(a), mergeSort(b));
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
				copyCount+=2;
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
