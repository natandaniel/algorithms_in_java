# Insertion Sort

Pseudo-code :
  
    for j = 2 to N
     key = A[j]
     //Insert A[j] in the ordered sequence A[1..j-1]
     i = j-1
     while i > 0 and A[i] > key
       A[i+1] = A[i]
       i = i-1
     A[i+1] = key
    
    
This algorithm has two iteration layers. Each top level iteration considers a sorted subarray of _i_ elements and an unsorted subarray of _N-i_ elements where _N_ is the size of the array _A_ to sort. At the beginning of the algorithm, the first element of _A_ will constitute the sorted subarray, and the remaining sequence will constitute the unsorted subarray. At the final step of the algorithm, the first _N-1_ elements will constitue the sorted subarray and the last element wil constitue the unsorted subarray. Therefore, this algorithm will always consider _N-1_ values to insert into the correct position, thus a first outer _for_ loop that will operate N-1 times.

During each top level iteration, the first element to the right of the sorted array, named _key_ in the pseudo code, is _**inserted**_ with an inner loop into its correct position within the sorted subarray to its left. At the end of this process, the algorithm now considers two new sorted and unsorted subarrays and repeats the process until the _A_ is completed sorted.

If the array is initially sorted in descending order, then _N-1_ insertions are needed. If _i_ is the number of elements in the sorted subarray. The _key_ will be inserted into its correct position after having moved to the right all _i_ elements. Therefore for iteration j, there are j-1


the complexity is given by the following formulae : _1 + 2 + 3 + ... + N-1 = N*(N-1)/2_. Indeed, for each subarry of size _M_, _M_ insertions may be required and only the first _N-1_ sorted subarrays need to be considered. Final complexity for the worst case scenario: **_~O(N^2/2)_**. In the best case scenario, the array is already sorted and the complexity is **_N-1_**.
