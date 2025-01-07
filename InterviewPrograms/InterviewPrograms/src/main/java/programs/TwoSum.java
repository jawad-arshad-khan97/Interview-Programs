package programs;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {

    public static List<int[]> findAllTwoSums(int[] nums, int target) {
        // Use a HashSet to remove duplicates and store unique numbers
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        // Find pairs using a HashMap
        List<int[]> result = new ArrayList<>();
        Map<Integer, Boolean> seen = new HashMap<>();

        for (int num : uniqueNums) {
            int complement = target - num;
            if (seen.getOrDefault(complement, false)) {
                result.add(new int[]{complement, num});
            }
            // Mark the current number as seen
            seen.put(num, true);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, -2, 9, 7, 2, -2};
        int target = 9;
        List<int[]> pairs = findAllTwoSums(nums, target);

        // Print the pairs
        System.out.println("Unique pairs that sum to " + target + ":");
        for (int[] pair : pairs) {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
}
