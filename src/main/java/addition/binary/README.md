<i>Following is the statement of the <b>binary addition problem</b> :
<p>
<b>input</b> : </br>
a sequence of n 0 or 1 values A = < a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub> > corresponding to the coefficients of an integer in base 2 over n bits : a<sub>1</sub>.2<sup>0</sup> + a<sub>2</sub>.2<sup>1</sup> + ... + a<sub>n</sub>.2<sup>n-1</sup></br>
a sequence of n 0 or 1 values B = < b<sub>1</sub>, b<sub>2</sub>, ..., b<sub>n</sub> > corresponding to the coefficients of an integer in base 2 over n bits : b<sub>1</sub>.2<sup>0</sup> + b<sub>2</sub>.2<sup>1</sup> + ... + b<sub>n</sub>.2<sup>n-1</sup>
<p>
<b>output</b> : a sequence of n+1 0 or 1 values C = < c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>n+1</sub> > corresponding to the coefficients of the integer in base 2 over n+1 bits resulting from the addition of A to B : c<sub>1</sub>.2<sup>0</sup> + c<sub>2</sub>.2<sup>1</sup> + ... + c<sub>n+1</sub>.2<sup>n</sup></br>

	add(A, B)
	  // create array C of size N+1 
	  for i = 1 to N+1
	    C[i] = 0
    
	  for i = 1 to N
	    sum = A[i] + B[i] + C[i]
	    if (sum == 1) C[i] = 1
	    else if (sum == 2)
	      C[i] = 0
	      C[i+1] = 1
	    else if(sum == 3)
	      C[i] = 1
	      C[i+1] = 1 	
		 
	  return C