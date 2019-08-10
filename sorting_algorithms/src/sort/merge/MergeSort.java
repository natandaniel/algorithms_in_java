package sort.merge;

import sort.common.Sort;

public class MergeSort extends Sort {

	public MergeSort() {
		super();
	}
	
	protected Integer[] sortArray(Integer[] input) {
		mergeSort(input, 0, input.length-1);
		return input;
	}

	private void mergeSort(Integer[] input, int p, int r) {
		
		instructionCount++;
		if(p<r) {
			instructionCount+=4;
			int q = (p+r)/2;
			mergeSort(input, p, q);
			mergeSort(input, q+1, r);
			merge(input,p,q,r);
		}
	}
	
	private void merge(Integer[] A, int p, int q, int r) {
		
		instructionCount+=4;
		
		int n1 = q-p+1;
		int n2 = r-q;
		Integer[] left = new Integer[n1+1];
		Integer[] right = new Integer[n2+1];
		
		for(int i=0;i<n1;i++) {
			
			instructionCount+=2;
			
			left[i] = A[p+i]; // left contains A[p..q]
		}
		instructionCount++;
		
		for(int i=0;i<n2;i++) {
			
			instructionCount+=2;
			
			right[i] = A[q+1+i]; // right contains A[q+1..r]
		}
		instructionCount++;
		
		instructionCount=+4;
		left[n1] = (int) Double.POSITIVE_INFINITY; // value used to know when the end of the array has been reached
		right[n2] = (int) Double.POSITIVE_INFINITY;
		
		int i=0;
		int j=0;
		
		for(int k=p; k<=r; k++) {
			
			instructionCount+=2;
			
			if(left[i] <= right[j]) {
				
				instructionCount+=2;
				
				A[k] = left[i];
				i++;
			}else {
				
				instructionCount+=2;
				
				A[k] = right[j];
				j++;
			}
		}
	}
}
