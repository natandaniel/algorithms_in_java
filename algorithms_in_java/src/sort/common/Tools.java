package sort.common;

public class Tools {
	
	public static final String NULL_ARRAY_ERR_MSG = "Array must not be null";
	public static final String EMPTY_ARRAY_ERR_MSG = "Array must not be empty";
	public static final String BUBBLE_SORT = "BUBBLE SORT";
	public static final String OPT_BUBBLE_SORT = "OPTIMISED BUBBLE SORT";
	
	public static boolean isAlreadySorted(int[] input) {
		
		int comparisonCount = 0;

		for (int i = 0; i < input.length - 1; i++) {
			comparisonCount++;
			if (input[i] > input[i+1]) {
				System.out.println("Unordered array to be sorted : " + arrayToString(input));
				return false;
			}
		}

		System.out.println("Array already sorted : " + arrayToString(input));
		System.out.println("Number of comparisons : " + comparisonCount);
		return true;
	}
	
	public static String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i] + " ");
		}
		return sb.toString();
	}
	
	public static void printArray(int[] array) {
		System.out.println(arrayToString(array));
	}
	
	public static void printIterationCount(int comparisonCount) {
		System.out.println("Number of comparisons : " + comparisonCount);
	}
}
