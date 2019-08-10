# Insertion Sort

Pseudo-code
  
    for j = 2 to A.length
     key = A[j]
     
     //Insert A[j] in the ordered sequence A[1..j-1]

     i = j-1

     while i > 0 and A[i] > key

       A[i+1] = A[i]

       i = i-1

     A[i+1] = key
    
    
