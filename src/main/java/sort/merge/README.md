<i>Merge Sort

  
    MergeSort(A, startIndex, endIndex) :
      if(startIndex < endIndex)
        middleIndex = (startIndex + endIndex)/2
        MergeSort(A, startIndex, middleIndex)
        MergeSort(A, middleIndex+1, endIndex)
        merge(A, startIndex, middleIndex, endIndex)
    
    Merge(A, startIndex, middleIndex, endIndex) : 
      // Copy both halfs of A into sub arrays L[1..firstHalfLength+1] and R[1..secondHalfLength+1]
      firstHalfLength = middleIndex - startIndex + 1
      secondHalfLength = endIndex - middleIndex
      
      for i = 1 to firstHalfLength
        L[i] = A[startIndex + i - 1]
        
      for j = 1 to secondHalfLength
        R[j] = A[middleIndex+j]
        
      L[firstHalfLength + 1] = infinity
      R[secondHalfLength + 1] = infinity
      
      i = 1
      j = 1
      for k = startIndex to endIndex
        if L[i] <= R[j]
          A[k] = L[i]
          i = i+1
        else
          A[k] = R[j]
          j = j+1
