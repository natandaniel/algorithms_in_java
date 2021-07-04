package sort.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Tools {

	public static final String NULL_ARRAY_ERR_MSG = "Array must not be null";
	public static final String EMPTY_ARRAY_ERR_MSG = "Array must not be empty";

	public static final String BUBBLE_SORT = "BUBBLE SORT";
	public static final String OPT_BUBBLE_SORT = "OPTIMISED BUBBLE SORT";
	public static final String INSERTION_SORT = "INSERTION SORT";
	public static final String SELECTION_SORT = "SELECTION SORT";
	public static final String MERGE_SORT = "MERGE SORT";
	public static final String QUICK_SORT = "QUICK SORT";

	public static final String ARRAY_IN_DESCENDING_ORDER_CASE = "ARRAY IN DESCENDING ORDER CASE";
	public static final String ARRAY_IN_RANDOM_ORDER_CASE = "ARRAY IN RANDOM ORDER CASE";
	public static final String ARRAY_IN_ASCENDING_ORDER_CASE = "ARRAY IN ASCENDING ORDER CASE";

	public static void printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++)
			sb.append(array[i] + " ");

		System.out.println(sb.toString());
	}

	public static Map<String, Integer[]> getData(int dataSize) {

		Integer[] randomValues = new Integer[dataSize];
		Random random = new Random();

		for (int i = 0; i < randomValues.length; i++) {
			randomValues[i] = random.nextInt(dataSize);
		}

		Integer[] descOrder = Arrays.copyOf(randomValues, randomValues.length);
		Arrays.sort(descOrder, Collections.reverseOrder());

		Integer[] ascOrder = Arrays.copyOf(randomValues, randomValues.length);
		Arrays.sort(ascOrder);

		Map<String, Integer[]> data = new HashMap<String, Integer[]>();
		data.put(ARRAY_IN_DESCENDING_ORDER_CASE, descOrder);
		data.put(ARRAY_IN_RANDOM_ORDER_CASE, randomValues);
		data.put(ARRAY_IN_ASCENDING_ORDER_CASE, ascOrder);

		return data;
	}

	public static void sort(String sortingAlgorithm, Sort sortingImpl, Integer[] arrayToSort, String scenario)
			throws Exception {

		System.out.println("Sorting algorithm : " + sortingAlgorithm);

		System.out.print(scenario + " ");
		printArray(arrayToSort);

		System.out.print("sorted array : ");
		printArray(sortingImpl.sort(arrayToSort));

		System.out.println("n° of instructions executed : " + sortingImpl.getInstructionCount());
	}
}
