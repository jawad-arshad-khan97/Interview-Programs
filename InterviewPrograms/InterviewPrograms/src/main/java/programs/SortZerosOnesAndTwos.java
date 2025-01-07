package programs;

import java.util.Arrays;

public class SortZerosOnesAndTwos {

    public static int[] sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp = 0;
        while (mid <= high) {
            if(nums[mid]== 0){
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] =  temp;
                high--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0,2,1,0,1,2,0,1,2,2,0,0,1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

}
