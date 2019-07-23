package sort.selection;

import static sort.common.Tools.*;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectSort(int[] input) throws Exception {

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

		return sortArray(input);
	}

	public static int[] sortArray(int[] input) {

		int[] copy = Arrays.copyOf(input, input.length);

		System.out.println("Selection sort on : " + arrayToString(copy));

		int comparisonCount = 0;
		
		for (int i = 0; i < copy.length - 1; i++) {

			int indexSmallest = i + 1;

			for (int j = i + 2; j < copy.length; j++) {
				comparisonCount++;
				if (copy[indexSmallest] > copy[j]) {
					indexSmallest = j;
				}
			}

			comparisonCount++;
			if (copy[indexSmallest] < copy[i]) {
				int temp = copy[i];
				copy[i] = copy[indexSmallest];
				copy[indexSmallest] = temp;
			} else if (copy[indexSmallest] == copy[i]) {
				int temp = copy[i + 1];
				copy[i + 1] = copy[indexSmallest];
				copy[indexSmallest] = temp;
			}
		}

		printIterationCount(comparisonCount);

		return copy;
	}
}
