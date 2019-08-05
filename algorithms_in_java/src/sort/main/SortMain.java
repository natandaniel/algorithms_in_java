package sort.main;

import static sort.common.Tools.arrayToString;
import static sort.insertion.InsertionSort.insertSort;
import static sort.selection.SelectionSort.selectSort;
import static sort.merge.MergeSort.mergeSort;
import static sort.merge.MergeSort.setCountToZero;

import java.util.Random;

public class SortMain {

	public static void main(String[] args) {
		
		// Worst case scenario 
		int[] worstCase = {10, 9, 8, 7, 6,5 ,4, 3, 2, 1};
		
		// Random scenario

		int[] randomCase = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < randomCase.length; i++) {
			randomCase[i] = random.nextInt(10);
		}
		
		// best case scenario 
		int[] bestCase = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				
		try {
			System.out.println("Worst case scenario");
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(insertSort(worstCase)));
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(selectSort(worstCase)));
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(mergeSort(worstCase)));
			setCountToZero();
			System.out.println("*** ***");
			System.out.println("");
			System.out.println("Random case scenario");
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(insertSort(randomCase)));
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(selectSort(randomCase)));
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(mergeSort(randomCase)));
			setCountToZero();
			System.out.println("*** ***");
			System.out.println("");
			System.out.println("Best case scenario");
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(insertSort(bestCase)));
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(selectSort(bestCase)));
			System.out.println("*** ***");
			System.out.println("Sorted array : " + arrayToString(mergeSort(bestCase)));
			setCountToZero();
			System.out.println("*** ***");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
