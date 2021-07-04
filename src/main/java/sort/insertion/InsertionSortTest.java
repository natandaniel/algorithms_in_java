package sort.insertion;

import java.util.Random;

import sort.common.Tools;

class InsertionSortTest {

	public static void main(String[] args) {
		System.out.println("Insertion sort");

		int[] randomValues = new int[10];
		Random random = new Random();

		for (int i = 0; i < randomValues.length; i++)
			randomValues[i] = random.nextInt(10);

		InsertionSort.ascendingOrderSort(randomValues);

		Tools.printArray(randomValues);

		InsertionSort.descendingOrderSort(randomValues);

		Tools.printArray(randomValues);
	}
}
