package dynamicprogramming;

public class LongestCommonSubstring {

    class Solution{
        int longestCommonSubstr(String S1, String S2, int N, int M){

        /*

          ABCDGH
        A 100000
        C 00. -- storing maxium so far can create issue because its not the count which should be added to next same pair.
        D
        G
        H
        R

        */

            int[][] dp = new int[N+1][M+1];
            dp[0][0]=0; // empty and empty characters are 1 length.
            int max=0;

            for(int i=1; i<=N; i++) {
                for(int j=1; j<=M; j++) {
                    if(S1.charAt(i-1) == S2.charAt(j-1)) {
                        dp[i][j]=1+dp[i-1][j-1];
                    } else {
                        dp[i][j]=0;
                    }
                    max=Math.max(dp[i][j], max);
                }
            }

            return max;
        }
    }
}
