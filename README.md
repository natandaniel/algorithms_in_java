# Algorithms in Java

## [_Bubble Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/algorithms_in_java/src/sort/bubble)

A bubble sort. Each top layer iteration **_"bubbles up"_** the biggest element of the array. If _N_ is the size of the array, only _N-1_ top level iterations are needed to sort the array, each one having **_"bubbled up"_** the _N-1_ biggest elements and leaving the final and smallest element, in the first postition of the array. Each top level iteration encompasses another _N-1_ iterations making the complexity O(N^2).

## [_Insertion Sort_](https://github.com/natandaniel/algorithms_in_java/tree/master/algorithms_in_java/src/sort/insertion)

An insertion sort. Each top level iteration considers a subarray of the original array, starting with 1 element up to _N-1_ elements where _N_ is the size of the array to sort. Each subarray is considered to be sorted and the first element to the right is _**inserted**_ to its right place in the subarray. Worst case scenario,  the complexity is given by the following formulae : 1 + 2 + 3 + ... + N. Final complexity O(N^2/2);
