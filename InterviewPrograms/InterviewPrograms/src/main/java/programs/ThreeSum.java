package programs;

public class ThreeSum {
    import java.util.*;

    class ThreeSum {
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            // Step 1: Sort the array
            Arrays.sort(nums);

            // Step 2: Iterate through the array
            for (int i = 0; i < nums.length - 2; i++) {
                // Skip duplicate elements
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                // Step 3: Two-pointer approach
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        // Add the triplet to the result
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicates for the left pointer
                        while (left < right && nums[left] == nums[left + 1]) left++;

                        // Skip duplicates for the right pointer
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        // Move both pointers
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++; // Increase the sum
                    } else {
                        right--; // Decrease the sum
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {-1, 0, 1, 2, -1, -4};
            System.out.println("Triplets that sum to 0: " + threeSum(nums));
        }
    }

}
