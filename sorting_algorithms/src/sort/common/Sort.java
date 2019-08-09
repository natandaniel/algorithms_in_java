package sort.common;

import java.util.Arrays;

public abstract class Sort implements ISort {

	protected int comparisonCount;
	protected int swapCount;
	protected int copyCount;

	public Sort() {
		comparisonCount = 0;
		swapCount = 0;
		copyCount = 0;
	}
	
	@Override
	public Integer[] sort(Integer[] input) throws Exception {

		comparisonCount = 0;
		swapCount = 0;
		copyCount = 0;

		if (input == null) {

			throw new Exception("Null input array -> nothing to sort");

		} else if (input.length == 0) {

			throw new Exception("Empty input array -> nothing to sort");

		} else if (input.length == 1) {
			return input;

		} else {

			final int N = input.length;
			Integer[] copy = Arrays.copyOf(input, N);

			return sortArray(copy);
		}
	}
	
	protected abstract Integer[] sortArray(Integer[] input);
	
	public int getComparisonCount() {
		return comparisonCount;
	}

	public int getSwapCount() {
		return swapCount;
	}

	public int getCopyCount() {
		return copyCount;
	}
}
