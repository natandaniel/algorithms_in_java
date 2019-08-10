package sort.common;

import java.util.Arrays;

public abstract class Sort implements ISort {

	protected int instructionCount;

	public Sort() {
		instructionCount = 0;
	}
	
	@Override
	public Integer[] sort(Integer[] input) throws Exception {

		instructionCount = 0;

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
	
	public int getInstructionCount() {
		return instructionCount;
	}
}
