# Insertion Sort


input : sequence _A_ of of _N_ numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>

output : a permutation of _A_ a'<sub>1</sub>, a'<sub>2</sub>, ..., a'<sub>N</sub> such as a'<sub>1</sub> <= a'<sub>2</sub> <= a'<sub>3</sub>...<= a'<sub>N</sub>

Pseudo-code :
  
    for j = 2 to N
     key = A[j]
     //Insert A[j] in the ordered sequence A[1..j-1]
     i = j-1
     while i > 0 and A[i] > key
       A[i+1] = A[i]
       i = i-1
     A[i+1] = key    


Proof of correctness : 

_invariant_ : A[1..j-1] is sorted and contains numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>j-1</sub>

_initialization_ : A[1] is sorted and contains a<sub>1</sub>

_conservation_ : considering A[1..j-1] is sorted and contains numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>j-1</sub>, the next iteration inserts A[j] into the right position such that A[1..j] is sorted and contains numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>j</sub> 

_termination_ : the algorithm ends when A[N] is inserted into sequence A[1..N-1] such that A[1..N] is sorted and contains numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>


If _A_ is initially sorted in descending order, then the insertion sort algorithm is faced with its worst case scenario, having to shift to the right all the elements of the sorted subarray when a key is to be inserted. The time complexity is quadratic relatively to the size of _A_ : **_O(N^2)_**.

If _A_ is initially sorted in ascending order, then the insertion sort algorithm is faced with its best case scenario where no element has to be moved the right. The time complexity is linear relatively to the size of _A_ : **_O(N)_**.
