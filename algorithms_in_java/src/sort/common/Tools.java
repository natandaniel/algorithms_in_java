package sort.common;

public class Tools {
	
	public static boolean isAlreadySorted(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[++i]) {
				System.out.println("Unordered array to be sorted : " + arrayToString(input));
				return false;
			}
		}

		System.out.println("Array already sorted : " + arrayToString(input));
		return true;
	}
	
	public static String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i] + " ");
		}
		return sb.toString();
	}
	
	public static void printIterationCount(int iterationCount) {
		System.out.println("Number of iterations : " + iterationCount);
	}
}
