package sort.insertion;

import static sort.common.Tools.ARRAY_IN_ASCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_DESCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_RANDOM_ORDER_CASE;
import static sort.common.Tools.INSERTION_SORT;
import static sort.common.Tools.getData;
import static sort.common.Tools.sort;

import java.util.Map;

import sort.common.Sort;

public class InsertionSortTest {

	public static void main(String[] args) throws Exception {

		System.out.println("Insertion sort");

		Map<String, Integer[]> data = getData(10);

		Sort insertSort = new InsertionSort();

		sort(INSERTION_SORT, insertSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE),
				ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(INSERTION_SORT, insertSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(INSERTION_SORT, insertSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);
	}
}
