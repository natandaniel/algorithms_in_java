package search.linear;

import java.util.OptionalInt;

public class LinearSearch {

	private LinearSearch() {
	}

	/**
	 * Returns the index of the specified value within the specified integer array
	 * if present, an empty optional otherwise.
	 * 
	 * @param value an integer value to search within the specified integer array
	 * @param input the integer array in which to search for the specified value
	 * @return an optional with the index of the specified value within the
	 *         specified integer array if present, an empty optional otherwise.
	 */
	public static OptionalInt search(int value, int[] input) {
		if (input != null) {
			for (int i = 0; i < input.length; i++) {
				if (input[i] == value)
					return OptionalInt.of(i);
			}
		}

		return OptionalInt.empty();
	}

}
