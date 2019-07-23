package sort.bubble;

import static sort.common.Tools.*;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int[] input) throws Exception {

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

	private static int[] sortArray(int[] input) {
		
		int[] copy = Arrays.copyOf(input, input.length);

		System.out.println("Bubble sort on : " + arrayToString(copy));

		int iterationCount = 0;

		for (int i = 0; i < copy.length - 1; i++) {
			for (int j = 0; j < copy.length - 1; j++) {
				++iterationCount;
				if (copy[j] > copy[j + 1]) {
					int temp = copy[j];
					copy[j] = copy[j + 1];
					copy[j + 1] = temp;
				}
			}
		}

		printIterationCount(iterationCount);

		return copy;
	}
}
