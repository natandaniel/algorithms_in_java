package sort.insertion;

import static sort.common.Tools.*;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertSort(int[] input) throws Exception {

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

		System.out.println("Insertion sort on : " + arrayToString(copy));

		int comparisonCount = 0;
		int outerIterationCount = 0;
		
		for (int i = 0; i < copy.length - 1; i++) {

			int j = i + 1;
			outerIterationCount++;
			
			while (j > 0 && copy[j] < copy[j - 1]) {
				comparisonCount++;
				int temp = copy[j - 1];
				copy[j - 1] = copy[j];
				copy[j] = temp;
				j = j - 1;
			}
		}

		if(comparisonCount == 0) {
			printIterationCount(outerIterationCount);
		}else {
			printIterationCount(comparisonCount);
		}
		

		return copy;
	}
}
