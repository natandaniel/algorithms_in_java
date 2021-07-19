# Selection Sort


input : sequence _A_ of _N_ numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>

output : a permutation of _A_ a'<sub>1</sub>, a'<sub>2</sub>, ..., a'<sub>N</sub> such as a'<sub>1</sub> <= a'<sub>2</sub> <= a'<sub>3</sub>...<= a'<sub>N</sub>

pseudo-code :
 
    N = A.length  
    for j = 1 to N-1
    	min = j
    	for i = j+1 to N
       	if A[i] < A[min]
       		min = i
     	switch A[j] and A[min]  


Proof of correctness : 

_invariant_ : A[1..j-1] is sorted and contains the first j-1 smallest elements of A[1..N]

_initialization_ : for the first iteration, j=1; 

_conservation_ : considering the invariant to be true prior to iteration j, after iteration j, the smallest element within A[j..N] is positioned at index j; A[1..j] is sorted and contains the first j smallest elements of A[1..N]

_termination_ : the algorithm ends when j=N; the invariant results in sub-array A[1..N-1] being sorted and containing the first N-1 smallest elements, resulting in array A[1..N] being sorted 


Whether facing the worst case scenario or not, looking for the minimum values results in n-j comparisons during each iteration j, the time complexity is quadratic relatively to the size of _A_ : **_O(N^2)_**.
