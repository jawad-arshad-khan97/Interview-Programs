package programs;

public class LongestSubstring {

    public void longestSubString(String s1, String s2) {

        String res = "";
        int j = 0;

        for (int i = 0; j<s2.length() && i < s1.length(); i++) {

            if (s1.charAt(i) == s2.charAt(j)) {
                res += s1.charAt(i);
                j++;
            } else {
                continue;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args){
        LongestSubstring longest = new LongestSubstring();
        longest.longestSubString("Good climate", "Good");

    }

}
