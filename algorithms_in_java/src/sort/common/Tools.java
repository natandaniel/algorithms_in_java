package sort.common;

import static sort.common.Tools.arrayToString;

public class Tools {
	
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
	
	public static void printIterationCount(int comparisonCount) {
		System.out.println("Number of comparisons : " + comparisonCount);
	}
}
