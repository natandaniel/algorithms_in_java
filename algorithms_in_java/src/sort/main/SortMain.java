package sort.main;

import static sort.bubble.BubbleSort.bubbleSort;
import static sort.common.Tools.arrayToString;
import static sort.insertion.InsertionSort.insertSort;

import java.util.Arrays;
import java.util.Random;

public class SortMain {

	public static void main(String[] args) {

		int[] bubbleSortinput = new int[20];
		Random random = new Random();
		
		for (int i = 0; i < bubbleSortinput.length; i++) {
			bubbleSortinput[i] = random.nextInt(1000);
		}
		
		// Making copies for comparison
		
		int[] insertionSortInput = Arrays.copyOf(bubbleSortinput, bubbleSortinput.length);

		try {
			System.out.println("Sorted array : " + arrayToString(bubbleSort(bubbleSortinput)));
			System.out.println("");
			System.out.println("Sorted array : " + arrayToString(insertSort(insertionSortInput)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
