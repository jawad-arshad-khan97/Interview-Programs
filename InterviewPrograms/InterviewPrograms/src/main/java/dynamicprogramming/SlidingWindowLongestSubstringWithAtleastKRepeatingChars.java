package dynamicprogramming;

public class SlidingWindowLongestSubstringWithAtleastKRepeatingChars {

    static class Solution {

        //recursion
        public int longestSubstring(String s, int k) {
            return helper(s, 0, s.length(), k);
        }

        int helper(String s, int start, int end, int k) {
            char[] charArr = s.toCharArray();

//            if (end - start < k) return 0;

            int[] count = new int[26];

            for (int i = start; i < end; i++) {
                count[charArr[i] - 'a'] += 1;
            }

            for (int i = start; i < end; i++) {
                if (count[charArr[i] - 'a'] < k) {
                    int j = i + 1;

                    while (j < end && count[charArr[j] - 'a'] > k) {
                        j++;
                    }

                    return Math.max(helper(charArr.toString(), start, i, k), helper(charArr.toString(), j, end, k));
                }
            }

            return end-start;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "ababbc";
        solution.longestSubstring(str, 2);


    }
}
