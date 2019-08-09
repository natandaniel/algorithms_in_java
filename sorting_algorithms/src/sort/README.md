# Sorting Algorithms

## [_Bubble Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/sorting_algorithms/src/sort/bubble)

The bubble sort algorithm. This algorithm has two iteration layers.

Each top layer iteration considers the remaining subarray of unsorted elements. The first top layer iteration will therefore consider the entire array. Each of these iterations will have the biggest element of the considered array **_"bubbled up"_** to its last index. The following iteration will manipulate the new subarray of unsorted elements.

If _N_ is the size of the array, at most _N-1_ top level iterations are needed to sort the array, each one having **_"bubbled up"_** the _N-1_ biggest elements and leaving the final and smallest element in the first index of the array.

Each top level iteration encompasses a certain amount of comparisons and swaps. If the considered unsorted subarray is of size _N-i_, _N-i-1_ comparisons at most are necesseary. In the optimised version of the algorithm, the comparisons stop when no swap is detected. However, in the non optimised version of the algorithm, the _N-i-1_ comparisons will always occur.

In every case, worst, random or best, the comparison count for the non optimised bubble sort will always be : **_N-1 + N-2 + ... 2 + 1 = N.(N-1)/2 --> O(N^2)_**. On the other hand, depending on the scenario, the swap count will be different. In the the worst case scenario in which the initial array is sorted in descending order, there will be as much swaps as comparisons. In any random case, the swap count will probably be smaller. Finally, in the best case scenario in which the initial array is already sorted in ascending order, there will be no swaps.

For the optimised version of the algorithm, the comparison count can be reduced. In the worst case scenario, the comparison count is still given by **_N-1 + N-2 + ... 2 + 1 = N.(N-1)/2 --> O(N^2)_**. In any random case, the comparison count will probably be smaller if at some top layer iteration no swap is detected in the considered subarray. In the best case scenario, the comparison count is exactly **_N-1_ --> O(N)**.

## [_Insertion Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/sorting_algorithms/src/sort/insertion)

The insertion sort algorithm. This algorithm has two iteration layers. Each top level iteration considers a sorted subarray of _i_ elements and an unsorted subarray of _N-i_ elements where _N_ is the size of the original array to sort. The elements in the unsorted subarray may be smaller than the elements in the sorted subarray. At each top level iteration, the first element to the right of the sorted array is _**inserted**_ with an inner loop to its right place in the sorted subarray rendering a new sorted subarray. In the worst case scenario where the original array is sorted in descennding order, the complexity is given by the following formulae : _1 + 2 + 3 + ... + N-1 = N*(N-1)/2_. Indeed, for each subarry of size _M_, _M_ insertions may be required and only the first _N-1_ sorted subarrays need to be considered. Final complexity for the worst case scenario: **_~O(N^2/2)_**. In the best case scenario, the array is already sorted and the complexity is **_N-1_**.

## [_Selection Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/sorting_algorithms/src/sort/selection)

The selection sort algorithm. This algorithm has two iteration layers. Each top level iteration considers a sorted subarray of _i_ elements and an unsorted subarray of _N-i_ elements where _N_ is the size of the original array to sort. All the elements in the unsorted subarray are bigger than the elements in the sorted subarray. During each top level iteration, the smallest element in the unsorted subarray is **selected** with an inner iteration and placed at the bottom of the unsorted subarray making place to two new sorted and unsorted subarrays. In every case, the complexity of this algorithm is given by the following formulae : _1 + 2 + 3 + ... + N-1 = N*(N-1)/2_. Indeed, for each subarry of size _M_, _M-1_ comparisons are done. Complexity : **_~O(N^2/2)_**.

## [_Merge Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/sorting_algorithms/src/sort/merge)

The merge sort algorithm. This algorithm uses recursive calls to sort an array. Each recursion verifies if the input array is of size 1 in which case it is returned. If not, the array is subdivided into two arrays and merge sort is recursiveley called on both arrays.  At the end of these sortings, the returned sorted arrays are merged into a single array which is then returned. On average and in the worst case scenario, complexity is **_~O(N.log(N))_**.
