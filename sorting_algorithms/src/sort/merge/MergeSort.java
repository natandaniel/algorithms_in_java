package sort.merge;

import sort.common.Sort;

public class MergeSort extends Sort {

	public MergeSort() {
		super();
	}

	protected Integer[] sortArray(Integer[] input) {

		instructionCount++;
		if (input.length == 1) {
			instructionCount++;
			return input;
		}

		instructionCount+=2;
		Integer[] a = new Integer[input.length / 2];
		Integer[] b = new Integer[input.length - input.length / 2];

		
		for (int i = 0; i < input.length / 2; i++) {
			instructionCount++;
			
			instructionCount++;
			a[i] = input[i];
		}
		instructionCount++; // adding final for loop test to the instruction count

		for (int i = 0; i < input.length - input.length / 2; i++) {
			instructionCount++;
			
			instructionCount++;
			b[i] = input[i + input.length / 2];
		}
		instructionCount++; // adding final for loop test to the instruction count

		instructionCount++;
		input = merge(sortArray(a), sortArray(b));
		
		return input;
	}

	private Integer[] merge(Integer[] a, Integer[] b) {

		instructionCount+=3;
		Integer[] mergedArray = new Integer[a.length + b.length];
		int k = 0;
		int l = 0;

		for (int i = 0; i < mergedArray.length; i++) {
			instructionCount++;
			
			instructionCount++;
			if (k < a.length && l < b.length && a[k] < b[l]) {
				
				instructionCount+=2;
				mergedArray[i] = a[k];
				k++;
				
			}else if (k < a.length && l < b.length && a[k] > b[l]) {
				
				instructionCount+=2;
				mergedArray[i] = b[l];
				l++;
				
			}else if (k < a.length && l < b.length && a[k] == b[l]) {
				
				instructionCount+=5;
				mergedArray[i] = a[k];
				mergedArray[i + 1] = b[l];
				l++;
				k++;
				i++;
				
			}else if (k == a.length && l < b.length) {
				
				instructionCount+=2;
				mergedArray[i] = b[l];
				l++;
				
			}else if (l == b.length && k < a.length) {
				
				instructionCount+=2;
				mergedArray[i] = a[k];
				k++;
			}
		}
		instructionCount++; // adding final for loop test to the instruction count

		return mergedArray;
	}
}
