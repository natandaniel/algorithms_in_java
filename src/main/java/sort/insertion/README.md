# Insertion Sort

## Iterative


    N = A.length  
    for j = 2 to N
      key = A[j]
      i = j-1
      while 0 < i and key < A[i]
        A[i+1] = A[i]
        i = i-1
      A[i+1] = key    


## Recursive

	sort(A, p, r)
	  if p < r
	    sort(A, p, r-1)
	    insert(A, p, r-1, A[r])
	    
	insert(A, p, r, key)
	  i = r
	  while p - 1 < i and key < A[i]
	    A[i] = A[i+1]
	    i = i - 1
	  A[i+1] = key


## analysis


|| Iterative  | Recursive |
| --- | --- | --- |
|spatial complexity | O(1)  | O(1) |
| time complexity - best case | O(N)  | O(N)  |
| time complexity - worst case | O(N<sup>2</sup>)  | O(N<sup>2</sup>)  |
| recursive calls | 0 | O(N)  |
