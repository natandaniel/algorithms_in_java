package sort.bubble;

import java.util.Random;

import sort.common.ISort;
import static sort.common.Tools.*;

public class BubbleSortTest {

	public static void main(String[] args) throws Exception {

		ISort bubbleSort = new BubbleSort();

		int[] worstCase = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.print("Bubble sort on worst case scenario : ");
		printArray(worstCase);

		System.out.print("--> ");
		printArray(bubbleSort.sortArray(worstCase, BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());

		System.out.print("Optimised bubble sort on worst case scenario : ");
		printArray(worstCase);

		System.out.print("--> ");
		printArray(bubbleSort.sortArray(worstCase, OPT_BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());

		int[] randomCase = new int[10];
		Random random = new Random();

		for (int i = 0; i < randomCase.length; i++) {
			randomCase[i] = random.nextInt(10);
		}

		System.out.print("Bubble sort on random case scenario : ");
		printArray(randomCase);

		System.out.print("--> ");
		printArray(bubbleSort.sortArray(randomCase, BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());

		System.out.print("Optimised bubble sort on random case scenario : ");
		printArray(randomCase);

		System.out.print("--> ");
		printArray(bubbleSort.sortArray(randomCase, OPT_BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());

		// best case
		int[] bestCase = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("Bubble sort on best case scenario : ");
		printArray(bestCase);

		System.out.print("--> ");
		printArray(bubbleSort.sortArray(bestCase, BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());

		System.out.print("Optimised bubble sort on best case scenario : ");
		printArray(bestCase);

		System.out.print("--> ");
		printArray(bubbleSort.sortArray(bestCase, OPT_BUBBLE_SORT));

		System.out.println("n° of comparisons : " + bubbleSort.getComparisonCount());
		System.out.println("n° of swaps : " + bubbleSort.getSwapCount());
	}
}
