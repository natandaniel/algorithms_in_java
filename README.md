# Algorithms in Java

## [_Bubble Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/algorithms_in_java/src/sort/bubble)

A sorting algorithm with two iteration layers. Each top layer iteration **_"bubbles up"_** the biggest element of the array. If _N_ is the size of the array, only _N-1_ top level iterations are needed to sort the array, each one having **_"bubbled up"_** the _N-1_ biggest elements and leaving the final and smallest element, in the first postition of the array. Each top level iteration encompasses another _N-1_ iterations making the complexity always **_(N-1)^2_** -> **~_O(N^2)_**.

## [_Insertion Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/algorithms_in_java/src/sort/insertion)

A sorting algorithm with two iteration layers. Each top level iteration considers a subarray of the original array, starting with the first element up to _N-1_ first elements where _N_ is the size of the array to sort. Each subarray is considered to be sorted and the first element to the right is _**inserted**_ to its right place in the subarray rendering a new subarray with one more element. Worst case scenario,  the complexity is given by the following formulae : _1 + 2 + 3 + ... + N-1 = N*(N-1)/2_. Indeed, for each subarry of size _M_, _M_ insertions may be required. Final complexity for the worst case : **~_O(N^2/2)_**. In the best case scenario, the array is already sorted and the complexity is **_N-1_**.

## [_Selection Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/algorithms_in_java/src/sort/selection)

The selection sort algorithm. This algorithm has two iteration layers. Each top level iteration considers a sorted subarray of _i_ elements and an unsorted subarray of _N-i_ elements where _N_ is the size of the original array to sort. All the elements in the unsorted subarray are bigger than the elements in the sorted subarray. During each top level iteration, the smallest element in the unsorted subarray is **selected** with an inner iteration and placed at the bottom of the unsorted subarray making place to two new sorted and unsorted subarrays. In every case, the complexity of this algorithm is given by the following formulae : _1 + 2 + 3 + ... + N-1 = N*(N-1)/2_. Indeed, for each subarry of size _M_, _M-1_ comparisons are done. Complexity : **~_O(N^2/2)_**.
