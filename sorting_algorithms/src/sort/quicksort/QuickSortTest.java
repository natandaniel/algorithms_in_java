package sort.quicksort;

import static sort.common.Tools.ARRAY_IN_ASCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_DESCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_RANDOM_ORDER_CASE;
import static sort.common.Tools.QUICK_SORT;
import static sort.common.Tools.getData;
import static sort.common.Tools.sort;

import java.util.Map;

import sort.common.Sort;

public class QuickSortTest {

	public static void main(String[] args) throws Exception {

		Map<String, Integer[]> data = getData(50);

		Sort quickSort = new QuickSort();

		sort(QUICK_SORT, quickSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE), ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(QUICK_SORT, quickSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(QUICK_SORT, quickSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);
	}
}
