# Merge Sort

Pseudo-code :
  
    MergeSort(A,p,r) :
      if(p<r)
        q = (p+r)/2
        MergeSort(A,p,q)
        MergeSort(A,q+1,r)
        merge(A,p,q,r)
    
    Merge(A,p,q,r) : 
      n1 = q-p+1
      n2 = r-q
      // Create two arrays L[1..n1+1], R[1..n2+1]
      for i = 1 to n1
        L[i] = A[p+i-1]
      for j = 1 to n2
        R[j] = A[q+j]
      L[n1+1] = ∞
      R[n2+1] = ∞
      i = 1
      j = 1
      for k = p to r
        if L[i] <= R[j]
          A[k] = L[i]
          i = i+1
        else
          A[k] = R[j]
          j = j+1
    
    
_A_ is the array to sort and _N_ is its size.

The merge sort algorithm recursively sorts _A_ using the _divide and conquer_ paradigm. If A is of size 1, A is returned. Otherwise, A is divided into two subsequences which are in turn sorted by recursively calling merge sort and finally, a merge is completed completely sort A. As long as a subsequence has at least two elements, merge sort is recursively called after dividing the problem into two subproblems.

Wether A is initially sorted or not doesn't change the time complexity of this algorithm which will always **_O(n*log(n))_**.
