package programs;

public class MaxSubArray {
    //Kandanes algo is the most optimised solution

    public static int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int sum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            curr_sum += nums[i];

            sum = Math.max(curr_sum, sum);
            if (curr_sum < 0) {
                curr_sum = 0;
            }

        }

        return sum;

    }

    public static void main(String[] args) {
        int[] a = {-2, 3, -1, 2};
        System.out.println(maxSubArray(a));
    }
}
