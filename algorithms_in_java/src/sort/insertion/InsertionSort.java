package sort.insertion;

import static sort.common.Tools.*;

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

		System.out.println("Insertion sort on : " + arrayToString(input));

		int iterationCount = 0;
		int outerIterationCount = 0;
		
		for (int i = 0; i < input.length - 1; i++) {

			int j = i + 1;
			outerIterationCount++;
			
			while (j > 0 && input[j] < input[j - 1]) {
				iterationCount++;
				int temp = input[j - 1];
				input[j - 1] = input[j];
				input[j] = temp;
				j = j - 1;
			}
		}

		if(iterationCount == 0) {
			printIterationCount(outerIterationCount);
		}else {
			printIterationCount(iterationCount);
		}
		

		return input;
	}

	public static void printIterationCount(int iterationCount) {
		System.out.println("Number of iterations : " + iterationCount);
	}
}
