package programs;

public class BinarySearch {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int key) {
        int lo=0, hi = arr.length-1;

        while(hi-lo>1){
         int mid = (hi-lo)/2;
         if(arr[mid]<key){
             lo=mid+1;
         } else {
             hi = mid;
         }

        }

        if(arr[lo]==key){
            return lo;
        } else if(arr[hi]==key) {
            return hi;
        }
        return -1;
    }
    int binarySearch2(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static int findPeakELement(int[] nums){
        int low = 0;
        int high = nums.length -1;

        while(low<high){
            int mid = (low + high)/2;

             if(nums[mid]> nums[mid +1]){
                 high = mid;
             }
             else {
                 low = mid + 1;
             }
        }
        return low;
    }



    }
