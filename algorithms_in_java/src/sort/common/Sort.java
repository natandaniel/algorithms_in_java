package sort.common;

public abstract class Sort implements ISort {

	protected int comparisonCount;
	protected int swapCount;
	protected int copyCount;

	public Sort() {
		comparisonCount = 0;
		swapCount = 0;
		copyCount = 0;
	}
	
	public int getComparisonCount() {
		return comparisonCount;
	}

	public int getSwapCount() {
		return swapCount;
	}

	public int getCopyCount() {
		return copyCount;
	}
}
