package sort.bubble;

import static sort.common.Tools.isAlreadySorted;
import static sort.common.Tools.printIterationCount;

public class BubbleSort {

	public static int[] bubbleSort(int[] input) throws Exception {

		if (input == null) {
			throw new Exception("Null input array -> nothing to sort");
		} else if (input.length == 0) {
			throw new Exception("Empty input array -> nothing to sort");
		}

		if (isAlreadySorted(input)) {
			return input;
		} else {
			return sortArray(input);
		}
	}

	private static int[] sortArray(int[] input) {

		System.out.println("Bubble sort ...");

		int iterationCount = 0;

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				++iterationCount;
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}

		printIterationCount(iterationCount);

		return input;
	}
}
