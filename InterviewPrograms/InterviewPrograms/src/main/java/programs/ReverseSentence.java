package programs;

import java.util.HashMap;
import java.util.Map;

public class ReverseSentence {

    public static String reverseSentence(String s){
        String res = "";
        String[] words = s.split(" ");
        for(int i=words.length-1; i>=0; i--){
            res = res + words[i] + " ";
        }

        return res;
    }


    public static void countFrequencyOfCharacters(String s){
        char[] charArray = s.toCharArray();
        int count=1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<charArray.length;i++){
            if(map.containsKey(charArray[i])){
                count=map.get(charArray[i]) + 1;
            }
            map.put(charArray[i], count);
            count=1;
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


    public static void main(String[] args){
        ReverseSentence obj = new ReverseSentence();
//        String res = reverseSentence("I Am Jawad bhai");
//        System.out.println(res);
        countFrequencyOfCharacters("GeeksForGeeks");
    }
}
