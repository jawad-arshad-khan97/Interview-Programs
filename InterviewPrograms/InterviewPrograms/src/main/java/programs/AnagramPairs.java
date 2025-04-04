package programs;

import java.util.HashMap;

public class AnagramPairs {

    public static void printAnagramPairs(String[] str) {
        HashMap<Integer, String> map = new HashMap<>();
        String wordRes1 = "";

        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            char[] charArr = word.toCharArray();
            int wordCharSum = 0;

            for (Character c : charArr) {
                wordCharSum += (c - 'a');
            }
            if (map.containsKey(wordCharSum)) {
                map.put(wordCharSum, map.get(wordCharSum) + "," + word);
            } else {
                map.put(wordCharSum, word);
            }
        }
    }

    public static void main(String args[]) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        printAnagramPairs(arr);
    }

}
