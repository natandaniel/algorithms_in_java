# Insertion Sort


input : sequence _A_ of _N_ numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>

output : a permutation of _A_ a'<sub>1</sub>, a'<sub>2</sub>, ..., a'<sub>N</sub> such as a'<sub>1</sub> <= a'<sub>2</sub> <= a'<sub>3</sub>...<= a'<sub>N</sub>

pseudo-code :
  
    N = A.length  
    for j = 2 to N
     key = A[j]
     //Insert A[j] in the ordered sequence A[1..j-1]
     i = j-1
     while 0 < i and key < A[i]
       A[i+1] = A[i]
       i = i-1
     A[i+1] = key    


Proof of correctness : 

_invariant_ : A[1..j-1] is sorted and contains original numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>j-1</sub>

_initialization_ : for the first iteration, j=2; A[1] is sorted and contains original number a<sub>1</sub>

_conservation_ : considering the invariant to be true prior to iteration j, during iteration j, elements a<sub>j-1</sub>, a<sub>j-2</sub>, ... are moved to the right in order to insert a<sub>j</sub> at the right position resulting in elements a<sub>1</sub> to a<sub>j</sub> being sorted and a permutation of original elements a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>j</sub> 

_termination_ : the algorithm ends when j=N+1; the invariant results in sub-array A[1..N] being sorted and containing elements a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub> which in fact is the complete array A


If _A_ is initially sorted in descending order, then the insertion sort algorithm is faced with its worst case scenario, having to shift to the right all the elements of the sorted subarray when a key is to be inserted. The time complexity is quadratic relatively to the size of _A_ : **_O(N^2)_**.

If _A_ is initially sorted in ascending order, then the insertion sort algorithm is faced with its best case scenario where no element has to be moved the right. The time complexity is linear relatively to the size of _A_ : **_O(N)_**.

This algorithm is therefore efficient with a small amount of numbers and proves to be a good choice in such cases as it remains relatively easy to implement.

However, when there are a lot of number to sort, this algorithm is slow and another algorithm should be considered (for instance the merge sort whose worst case complexity is _n*lg(n)_).
