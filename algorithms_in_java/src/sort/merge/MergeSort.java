package sort.merge;

import static sort.common.Tools.arrayToString;

import java.util.Arrays;

public class MergeSort {
	
	static int comparisonCount = 0;

	public static int[] mergeSort(int[] input) throws Exception {

		if (input == null) {
			throw new Exception("Null input array -> nothing to sort");
		} else if (input.length == 0) {
			throw new Exception("Empty input array -> nothing to sort");
		}

//		if (isAlreadySorted(input)) {
//			return input;
//		} else {
//			return sortArray(input);
//		}

		System.out.println("Merge sort on : " + arrayToString(input));
		
		int[] copy = Arrays.copyOf(input, input.length);
		copy = sortArray(copy);
		System.out.println("Number of comparisons : " + comparisonCount);
		return copy;
	}

	public static int[] sortArray(int[] input) {

		// System.out.println("Merge sort on : " + arrayToString(input));

		if (input.length == 1) {
			return input;
		}

		int[] a = new int[input.length / 2];
		int[] b = new int[input.length - input.length / 2];

		for (int i = 0; i < input.length / 2; i++) {
			a[i] = input[i];
		}

		for (int i = 0; i < input.length - input.length / 2; i++) {
			// System.out.println(i);
			b[i] = input[i + input.length / 2];
		}

		input = merge(sortArray(a), sortArray(b));
		return input;
	}

	public static int[] merge(int[] a, int[] b) {

		int[] mergedArray = new int[a.length + b.length];

		int k = 0;
		int l = 0;

		for (int i = 0; i < mergedArray.length; i++) {
			comparisonCount++;
			if (k < a.length && l < b.length && a[k] < b[l]) {
				mergedArray[i] = a[k];
				k++;
				continue;
			}

			if (k < a.length && l < b.length && a[k] > b[l]) {
				mergedArray[i] = b[l];
				l++;
				continue;
			}

			if (k < a.length && l < b.length && a[k] == b[l]) {
				mergedArray[i] = a[k];
				mergedArray[i + 1] = b[l];
				l++;
				k++;
				i++;
				continue;
			}

			if (k == a.length && l < b.length) {
				mergedArray[i] = b[l];
				l++;
				continue;
			}

			if (l == b.length && k < a.length) {
				mergedArray[i] = a[k];
				k++;
				continue;
			}
		}

		return mergedArray;
	}
	
	public static void setCountToZero() {
		comparisonCount = 0;
	}

	public static void main(String[] args) throws Exception {

		// Worst case scenario
		int[] worstCase = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("Sorted array : " + arrayToString(mergeSort(worstCase)));
	}
}
