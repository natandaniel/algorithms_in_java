package sort.merge;

import static sort.common.Tools.ARRAY_IN_ASCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_DESCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_RANDOM_ORDER_CASE;
import static sort.common.Tools.MERGE_SORT;
import static sort.common.Tools.getData;
import static sort.common.Tools.sort;

import java.util.Map;

import sort.common.Sort;

public class MergeSortTest {

public static void main(String[] args) throws Exception {
		
		Map<String , Integer[]> data = getData(50);

		Sort mergeSort = new MergeSort();
		
		sort(MERGE_SORT, mergeSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE), ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(MERGE_SORT, mergeSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(MERGE_SORT, mergeSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);
	}
}
