package sort.bubble;

import sort.common.ISort;
import static sort.common.Tools.*;

import java.util.Random;

public class BubbleSortTest {

	public static void main(String[] args) throws Exception {

		ISort bubbleSort = new BubbleSort();

		int[] worstCase = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		int[] randomCase = new int[10];
		Random random = new Random();

		for (int i = 0; i < randomCase.length; i++) {
			randomCase[i] = random.nextInt(10);
		}
		
		int[] bestCase = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		bubbleSort(bubbleSort, worstCase, WORST_CASE);
		bubbleSort(bubbleSort, randomCase, AVG_CASE);
		bubbleSort(bubbleSort, bestCase, BEST_CASE);
	}
	
	private static void bubbleSort(ISort bubbleSort, int[] array, String scenario) throws Exception {
		
		System.out.print(scenario + " scenario : ");
		printArray(array);

		System.out.print("\nBubble sort : ");
		printArray(bubbleSort.sortArray(array, BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());
		System.out.println("");
		
		System.out.print("Optimised bubble sort : ");
		printArray(bubbleSort.sortArray(array, OPT_BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());
		System.out.println("\n");
	}
}
