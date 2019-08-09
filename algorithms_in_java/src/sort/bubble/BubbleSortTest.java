package sort.bubble;

import static sort.common.Tools.*;

import java.util.Map;

import sort.common.Sort;

public class BubbleSortTest {

	public static void main(String[] args) throws Exception {

		Map<String, Integer[]> data = getData(50);

		Sort bubbleSort = new BubbleSort();

		sort(BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE), ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(OPT_BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE), ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(OPT_BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);
		sort(OPT_BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);
	}
}
