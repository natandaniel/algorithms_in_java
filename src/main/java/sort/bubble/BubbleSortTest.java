package sort.bubble;

import static sort.common.Tools.ARRAY_IN_ASCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_DESCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_RANDOM_ORDER_CASE;
import static sort.common.Tools.BUBBLE_SORT;
import static sort.common.Tools.OPT_BUBBLE_SORT;
import static sort.common.Tools.getData;
import static sort.common.Tools.sort;

import java.util.Map;

import sort.common.Sort;

public class BubbleSortTest {

	public static void main(String[] args) throws Exception {

		Map<String, Integer[]> data = getData(50);

		Sort bubbleSort = new BubbleSort();
		Sort optBubbleSort = new OptimisedBubbleSort();

		sort(BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE), ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(OPT_BUBBLE_SORT, optBubbleSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE), ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(OPT_BUBBLE_SORT, optBubbleSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);
		sort(OPT_BUBBLE_SORT, optBubbleSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);
	}
}
