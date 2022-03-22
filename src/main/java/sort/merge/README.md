<i>Merge Sort

  
    MergeSort(A, p, r) :
      if(p < r)
        q = (p + r)/2 // lower integer part
        MergeSort(A, p, q)
        MergeSort(A, q+1, r)
        Merge1(A, p, q, r)
        
        
        
    
    Merge1(A, p, q, r) : 
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
          
          
          
          
    // alternative merge procedure      
    Merge2(A, p, q, r) : 
      // Copy both halfs of A into sub arrays L[1..n1] and R[1..n2]
      n1 = q - p + 1
      n2 = r - q
      
      for i = 1 to n1
        L[i] = A[p + i - 1]
        
      for j = 1 to n2
        R[j] = A[q+j]
      
      i = 1
      j = 1
      for k = p to r 
        if j == n2+1 or (i < n1+1 and L[i] <= R[j])
          A[k] = L[i]
          i = i+1
        else
          A[k] = R[j]
          j = j+1


N = r - p + 1<p>
MergeSort execution time : 
 <ul>
 <li> worst case scenario : O(N.log<sub>2</sub>(N))</li>
</ul>

Merge execution time : 
 <ul>
 <li> best / average / worst case scenario : O(N)</li>
</ul>