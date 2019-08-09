package sort.versus;

import static sort.common.Tools.ARRAY_IN_RANDOM_ORDER_CASE;
import static sort.common.Tools.BUBBLE_SORT;
import static sort.common.Tools.INSERTION_SORT;
import static sort.common.Tools.MERGE_SORT;
import static sort.common.Tools.OPT_BUBBLE_SORT;
import static sort.common.Tools.QUICK_SORT;
import static sort.common.Tools.SELECTION_SORT;
import static sort.common.Tools.getData;
import static sort.common.Tools.sort;

import java.util.Map;

import sort.bubble.BubbleSort;
import sort.bubble.OptimisedBubbleSort;
import sort.common.Sort;
import sort.insertion.InsertionSort;
import sort.merge.MergeSort;
import sort.quick.QuickSort;
import sort.selection.SelectionSort;

public class Versus {

	public static void main(String[] args) throws Exception {

		Map<String, Integer[]> data = getData(100);

		Sort bubbleSort = new BubbleSort();
		Sort optBubbleSort = new OptimisedBubbleSort();
		Sort selectSort = new SelectionSort();
		Sort insertSort = new InsertionSort();
		Sort mergeSort = new MergeSort();
		Sort quickSort = new QuickSort();

		sort(BUBBLE_SORT, bubbleSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(OPT_BUBBLE_SORT, optBubbleSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(SELECTION_SORT, selectSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(INSERTION_SORT, insertSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(MERGE_SORT, mergeSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(QUICK_SORT, quickSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);

	}

}
