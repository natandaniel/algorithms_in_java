# Binary Addition


input : sequence _A_ of _N_ numbers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub> between 0 and 1 providing a binary representation of an integer value; sequence _B_ of _N_ numbers b<sub>1</sub>, b<sub>2</sub>, ..., b<sub>N</sub> between 0 and 1 providing a binary representation of an integer value;

output :  sequence _C_ of _N+1_ numbers c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>N+1</sub> between 0 and 1 providing a binary representation of the sum of the integers represented by _A_ and _B_

Pseudo-code :
    	
    carry = 0 
    
    for i = N to 1
     sum = A[i] + B[i] + carry
     if (sum == 3) 
     	C[i+1] = 1
     	carry = 1
     else if (sum == 2)
     	C[i+1] = 0
     	carry = 1
     else 
     	C[i+1] = sum;
     	carry = 0
     	
     C[1] = carry

For each index of _A_ and _B_, one addition and one to two comparisons are performed. The time complexity is linear relatively to the size of _A_ and _B_ : **_O(N)_**.