package sort.insertion;

import java.util.Random;

public class InsertionSort {

	public static int[] insertSort(int[] input) throws Exception {

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

	public static int[] sortArray(int[] input) {

		System.out.println("Insertion sort ...");

		int iterationCount = 0;

		for (int i = 0; i < input.length - 1; i++) {

			int j = i + 1;

			while (j > 0 && input[j] < input[j - 1]) {
				iterationCount++;
				int temp = input[j - 1];
				input[j - 1] = input[j];
				input[j] = temp;
				j = j - 1;
			}
		}

		printIterationCount(iterationCount);

		return input;
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

	public static void main(String[] args) {

		int[] input1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] input2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] input3 = { 654, 1, 45, 72, 85, 42, 13, 7, 20, 1 };

		int[] input4 = new int[15];
		Random random = new Random();
		for (int i = 0; i < input4.length; i++) {
			input4[i] = random.nextInt(50);
		}
		int[] input5 = new int[0];
		int[] input6 = null;

		try {
			System.out.println("Sorted array : " + arrayToString(insertSort(input1)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(input2)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(input3)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(input4)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(input5)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			try {
				System.out.println("Sorted array : " + arrayToString(insertSort(input6)));
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

}
