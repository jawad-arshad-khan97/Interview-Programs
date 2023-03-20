package dynamicprogramming;

public class SlidingWindowsConsecutiveOnes {


//    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//    Output: 6
//    Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


    class Solution {
        public int longestOnes(int[] nums, int k) {

            int maxConsecutiveOnes=0;
            int start = 0;
            int zeroCount=0;

            for(int end=0; end < nums.length; end++){
                if(nums[end]==0){
                    zeroCount++;
                }

                while(zeroCount>k){
                    if(nums[start]==0){
                        zeroCount--;
                    }
                    start++;
                }


                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, end-start+1);
            }

            return maxConsecutiveOnes;

        }
    }



}
