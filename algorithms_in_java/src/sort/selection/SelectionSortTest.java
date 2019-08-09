package sort.selection;

import static sort.common.Tools.ARRAY_IN_ASCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_DESCENDING_ORDER_CASE;
import static sort.common.Tools.ARRAY_IN_RANDOM_ORDER_CASE;
import static sort.common.Tools.SELECTION_SORT;
import static sort.common.Tools.getData;
import static sort.common.Tools.sort;

import java.util.Map;

import sort.common.Sort;

public class SelectionSortTest {

	public static void main(String[] args) throws Exception {
		
		Map<String , Integer[]> data = getData(50);

		Sort selectSort = new SelectionSort();
		
		sort(SELECTION_SORT, selectSort, data.get(ARRAY_IN_DESCENDING_ORDER_CASE), ARRAY_IN_DESCENDING_ORDER_CASE);
		sort(SELECTION_SORT, selectSort, data.get(ARRAY_IN_RANDOM_ORDER_CASE), ARRAY_IN_RANDOM_ORDER_CASE);
		sort(SELECTION_SORT, selectSort, data.get(ARRAY_IN_ASCENDING_ORDER_CASE), ARRAY_IN_ASCENDING_ORDER_CASE);

	}

}
