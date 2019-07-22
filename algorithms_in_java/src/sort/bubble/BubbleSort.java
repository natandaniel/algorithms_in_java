package sort.bubble;

import java.util.Random;

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

	public static boolean isAlreadySorted(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[++i]) {
				System.out.println("Unordered array to be sorted : ");
				return false;
			}
		}

		System.out.println("Array already sorted");
		return true;
	}

	public static int[] sortArray(int[] input) {

		printArray(input);

		int iterationCount = 0;

		System.out.println("Sorting array ...");

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

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
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
			printArray(bubbleSort(input1));
			System.out.println("");
			printArray(bubbleSort(input2));
			System.out.println("");
			printArray(bubbleSort(input3));
			System.out.println("");
			printArray(bubbleSort(input4));
			System.out.println("");
			printArray(bubbleSort(input5));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			try {
				printArray(bubbleSort(input6));
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}
}
