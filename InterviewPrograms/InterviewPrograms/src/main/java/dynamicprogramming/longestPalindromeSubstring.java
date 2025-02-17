package dynamicprogramming;

//Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.
//        Example 2:
//
//        Input: s = "cbbd"
//        Output: "bb"


public class longestPalindromeSubstring {
    static class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }

            int start = 0;
            int end = 0;

            for (int i = 0; i < s.length(); i++) {
                int odd = expandAroundCenter(s, i, i);
                int even = expandAroundCenter(s, i, i + 1);
                int max_len = Math.max(odd, even);

                if (max_len > end - start) {
                    start = i - (max_len - 1) / 2;
                    end = i + max_len / 2;
                }
            }

            return s.substring(start, end + 1);
        }

        private int expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return right - left - 1;
        }

    }

        public static void main(String[] args){
        Solution l = new Solution();
        System.out.println(l.longestPalindrome("babad"));
    }
}
