<i>Merge Sort

  
    MergeSort(A, p, r) :
      if(p < r)
        q = (p + r)/2 // lower integer part
        MergeSort(A, p, q)
        MergeSort(A, q+1, r)
        merge(A, p, q, r)
    
    Merge(A, p, q, r) : 
      // Copy both halfs of A into sub arrays L[1..n1+1] and R[1..n2+1]
      n1 = q - p + 1
      n2 = r - q
      
      for i = 1 to n1
        L[i] = A[p + i - 1]
        
      for j = 1 to n2
        R[j] = A[q+j]
        
      L[n1 + 1] = infinity
      R[n2 + 1] = infinity
      
      i = 1
      j = 1
      for k = p to r
        if L[i] <= R[j]
          A[k] = L[i]
          i = i+1
        else
          A[k] = R[j]
          j = j+1


execution time : 
 <ul>
 <li> worst case scenario : O(N.log<sub>2</sub>(N))</li>
</ul>