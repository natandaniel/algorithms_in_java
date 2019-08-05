package sort.common;

public interface ISort {

	int[] sortArray(int[] input, String sortingAlgorithm) throws Exception;
	
	public int getComparisonCount();

	public int getSwapCount();

}
