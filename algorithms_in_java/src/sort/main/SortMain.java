package sort.main;

import static sort.bubble.BubbleSort.bubbleSort;
import static sort.common.Tools.arrayToString;
import static sort.insertion.InsertionSort.insertSort;

import java.util.Arrays;
import java.util.Random;

public class SortMain {

	public static void main(String[] args) {
		
		// Worst case scenario 
		int[] bubbleWorstCase = {10, 9, 8, 7, 6,5 ,4, 3, 2, 1};
		int[] insertWorstCase = {10, 9, 8, 7, 6,5 ,4, 3, 2, 1};
		
		// Random scenario

		int[] bubbleSortRandomCase = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < bubbleSortRandomCase.length; i++) {
			bubbleSortRandomCase[i] = random.nextInt(10);
		}
		
		int[] insertionSortRandomCase = Arrays.copyOf(bubbleSortRandomCase, bubbleSortRandomCase.length);
		
		// best case scenario 
		int[] bubbleBestCase = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] insertBestCase = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				
		try {
			System.out.println("Sorted array : " + arrayToString(bubbleSort(bubbleWorstCase)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(insertWorstCase)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(bubbleSort(bubbleSortRandomCase)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(insertionSortRandomCase)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(bubbleSort(bubbleBestCase)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(insertBestCase)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
