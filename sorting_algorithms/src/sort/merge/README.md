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

The merge sort algorithm recursively sorts _A_. It subdivides A has at least two elements, it divides A into two and calls merge sort on both subsequences.
Finally it merges both sorted subsequences into one. 

If _A_ is initially sorted in descending order, then the insertion sort algorithm is faced with its worst case scenario, having to move to the right all the elements of the sorted subarray when a key is to be inserted. The complexity is quadratic relatively to the size of _A_ : **_O(n^2)_**.

If _A_ is initially sorted in ascending order, then the insertion sort algorithm is faced with its best case scenario where no element has to be moved the right. The complexity is linear relatively to the size of _A_ : **_O(n)_**.
