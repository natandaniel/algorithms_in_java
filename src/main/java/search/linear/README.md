# Linear Search


input : sequence _A_ of _N_ numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>; value _v_;

output : integer i such that _A[i]=v_ if _v_ is found within _A_, _Nil_ otherwise

Pseudo-code :
  
    for i = 1 to N
     if(A[i] == v) return i
    
    return Nil


Proof of correctness : 

_invariant_ : A[i] contains value a<sub>i</sub> which is either equal to v or not

_initialization_ : A[1] contains value a<sub>1</sub> which is either equal or not to v

_conservation_ : considering A[i] is equal or not to value v, A[i+1] is also either equal or not to v

_termination_ : the algorithm ends if there is an index i such that A[i] is equal to v or if no values within A are equal to v

If _A_ does not contain _v_ or contains _v_ at the last index, then the linear search algorithm is faced with its worst case scenario, having to compare all of its the elements with _v_. The time complexity is linear relatively to the size of _A_ : **_O(N)_**.

If _A_ contains v at its first index, then the linear search algorithm is faced with its best case scenario, having to operate a single comparison, complexity is : **_O(1)_**.