package programs;

//  1, 4, 7, 4 , 2
public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {

            if (nums.length == 0) {
                return 0;
            }

            int i = 0, j = nums.length - 1;

            while (i < j) {
                if (nums[i] == val) {
                    nums[i] = nums[j];
                    j--;
                } else {
                    i++;
                }
            }

            if (nums[i] == val) {
                return i;
            }

            return i + 1;


        }
    }
}
