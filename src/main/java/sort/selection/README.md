Selection Sort
 
    N = A.length  
    for j = 1 to N-1
     min = j
     for i = j+1 to N
      if A[i] < A[min]
       min = i
     swap A[j] and A[min]  
