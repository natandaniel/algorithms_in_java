package sort.quicksort;

import static sort.common.Tools.EMPTY_ARRAY_ERR_MSG;
import static sort.common.Tools.NULL_ARRAY_ERR_MSG;

import java.util.Arrays;

import sort.common.Sort;
import sort.common.ISort;

public class QuickSort extends Sort implements ISort {
	
	public QuickSort() {
		super();
	}


	@Override
	public Integer[] sort(Integer[] input, String sortingAlgorithm) throws Exception {
		
		comparisonCount = 0;
		swapCount = 0;
		copyCount = 0;

		if (input == null) {

			throw new Exception(NULL_ARRAY_ERR_MSG);

		} else if (input.length == 0) {

			throw new Exception(EMPTY_ARRAY_ERR_MSG);
			
		}else if(input.length == 1) {
			return input;
			
		}else {
			
			final int N = input.length;
			Integer[] copy = Arrays.copyOf(input, N);
			
			quickSort(copy, 0, N-1);
			
			return copy;
		}
	}

	private void quickSort(Integer[] input, int firstIndex, int lastIndex) {
		
		comparisonCount++;
		if(firstIndex < lastIndex) {
			int pivotIndex = partitionArray(input, firstIndex, lastIndex);
			quickSort(input, firstIndex, pivotIndex-1);
			quickSort(input, pivotIndex+1, lastIndex);
		}
	}
	
	private int partitionArray(Integer[] array, int p, int r) {
		
		int pivotValue = array[r];
		
		int i = p-1;
		
		for(int j=p;j<r;j++) {
			comparisonCount++;
			if(array[j] <= pivotValue) {
				i++;
				if(i != j) {
					swapCount++;
					copyCount+=3;
					int save = array[i];
					array[i] = array[j];
					array[j] = save;
				}
			}
		}
		
		if(i+1 != r) {
			swapCount++;
			copyCount+=3;
			int save = array[i+1];
			array[i+1] = pivotValue;
			array[r] = save;
		}
		
		return i+1;
		
	}
}
