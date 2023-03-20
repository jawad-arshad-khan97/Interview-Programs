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

            String res="";
            int resLength=0;
            int l=0,r=0;
            int n = s.length();

            for(int i=0;i<n;i++){
                l=i;
                r=i;
                if(s.length()%2==0){
                    r=i+1;
                }

                while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                    if((r-l+1)>resLength){
                        res=s.substring(l,r+1);
                        resLength = r-l+1;
                    }
                    l=l-1;
                    r=r+1;
                }

            }
            return res;

        }
    }

    public static void main(String[] args){
        Solution l = new Solution();
        System.out.println(l.longestPalindrome("babad"));
    }
}
