<i>Following is the statement of the <b>binary search problem</b> :
<p>
<b>input</b> : a sorted sequence of n numbers A = < a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub> > ; a value v to search for in A;  </br>
<p>
<b>output</b> :  the index i within the range [1..n] such that A[i] = v if v is effectively found within A, Nil otherwise

  
  
Iterative version :    
     
    BinarySearch(A, v, p, r) // p start index, r end index, use 0 and A.length to search for a value in the entire array
      if(r < p)
        return Nil
        
      a = p
      b = r
      q = (a + b)/2    // lower integer part
      
      while(A[q] != v)
        if(A[q] < v)
          a = q + 1
        else
          b = q - 1
          
        if(b < a)
          return Nil
          
        q = (a + b)/2    // lower integer part
     
      return q

Recursive version :

    BinarySearch(A, v, p, r) // p start index, r end index, use 0 and A.length to search for a value in the entire array
      if(r < p)
        return Nil
        
      a = p
      b = r
      q = (a + b)/2    // lower integer part
      if((A[q] == v)
        return q
        
      if(A[q] < v)
        search(A, v, q + 1, b)
      else
        search(A, v, a, q - 1)
    

N = r - p + 1<p>

BinarySearch execution time : 
 <ul>
 <li> worst case scenario, iterative or recursive version : O(log<sub>2</sub>(N))</li>
</ul>


recursive BinarySearch number of recursive calls : 
 <ul>
 <li> worst case scenario : log<sub>2</sub>(N)+1</li>
</ul>
