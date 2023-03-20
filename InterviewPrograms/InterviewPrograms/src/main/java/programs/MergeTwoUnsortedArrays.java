package programs;

public class MergeTwoUnsortedArrays {
    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
            if (a >= 0 && A[a] > B[b]) A[i] = A[a--];
            else A[i] = B[b--];
        }
    }
}

// initialize 3 pointers
//2 in the first array and one in second array at the end
//if a>b move a and decrement it
//        if b>a move a and decrement it

