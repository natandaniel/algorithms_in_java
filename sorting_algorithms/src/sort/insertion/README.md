# Insertion Sort

input : sequence _A_ of numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>
output : a permutation of _A_ a'<sub>1</sub>, a'<sub>2</sub>, ..., a'<sub>N</sub> such as a'<sub>1</sub> <= a'<sub>2</sub> <= a'<sub>3</sub>...

Pseudo-code :
  
    for j = 2 to N
     key = A[j]
     //Insert A[j] in the ordered sequence A[1..j-1]
     i = j-1
     while i > 0 and A[i] > key
       A[i+1] = A[i]
       i = i-1
     A[i+1] = key
    
    
_A_ is the array to sort and _N_ is its size.

The insertion sort algorithm iteratively sorts _A_ and starts by considering the subarray holding the first value of _A_. This subarray is by nature already sorted. This algorithm then considers the first element to the right of the sorted subarray, the _key_ value in the pseudo code, and **_inserts_** this value into its correct position within what will be the new sorted subarray. 

If _A_ is initially sorted in descending order, then the insertion sort algorithm is faced with its worst case scenario, having to move to the right all the elements of the sorted subarray when a key is to be inserted. The complexity is quadratic relatively to the size of _A_ : **_O(n^2)_**.

If _A_ is initially sorted in ascending order, then the insertion sort algorithm is faced with its best case scenario where no element has to be moved the right. The complexity is linear relatively to the size of _A_ : **_O(n)_**.
