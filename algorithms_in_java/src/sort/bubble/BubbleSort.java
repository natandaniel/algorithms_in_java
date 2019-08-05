package sort.bubble;

import java.util.Arrays;

import sort.common.ISort;

import static sort.common.Tools.*;

public class BubbleSort implements ISort{
	
	private int comparisonCount;
	private int swapCount;
	
	
	public BubbleSort() {
		comparisonCount = 0;
		swapCount = 0;
	}

	@Override
	public int[] sortArray(int[] input, String sortingAlgorithm) throws Exception {

		if (input == null) {
			
			throw new Exception(NULL_ARRAY_ERR_MSG);
			
		} else if (input.length == 0) {
			
			throw new Exception(EMPTY_ARRAY_ERR_MSG);
		}

		if (OPT_BUBBLE_SORT.equals(sortingAlgorithm)) {
			
			return optimisedBubbleSort(input);
			
		} else {
			
			return bubbleSort(input);
		}

	}

	private int[] bubbleSort(int[] input) {
		
		comparisonCount = 0;
		swapCount = 0;

		final int N = input.length;

		int[] copy = Arrays.copyOf(input, N);

		for (int i = N - 1; 1 <= i; i--) {

			for (int j = 0; j <= i - 1; j++) {
				
				comparisonCount++;
				
				if (copy[j + 1] < copy[j]) {
					
					swapCount++;

					int temp = copy[j];
					copy[j] = copy[j + 1];
					copy[j + 1] = temp;
				}
			}
		}

		return copy;
	}

	private int[] optimisedBubbleSort(int[] input) {
		
		comparisonCount = 0;
		swapCount = 0;

		final int N = input.length;

		int[] copy = Arrays.copyOf(input, N);

		for (int i = N - 1; 1 <= i; i--) {

			boolean isSorted = true;

			for (int j = 0; j <= i - 1; j++) {
				
				comparisonCount++;

				if (copy[j + 1] < copy[j]) {
					
					swapCount++;

					int temp = copy[j];
					copy[j] = copy[j + 1];
					copy[j + 1] = temp;

					isSorted = false;
				}
			}

			if (isSorted) {
				break;
			}
		}

		return copy;
	}

	@Override
	public int getComparisonCount() {
		return comparisonCount;
	}

	@Override
	public int getSwapCount() {
		return swapCount;
	}
}
