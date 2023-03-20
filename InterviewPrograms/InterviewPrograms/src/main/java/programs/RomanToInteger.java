package programs;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int answer=0;

        for(int i=0; i<s.length()-1;i++){
            char c_current = s.charAt(i);
            char c_next = s.charAt(i+1);
            if(map.get(c_current)<map.get(c_next)) answer = answer - map.get(c_current);
            else answer = answer + map.get(c_current);
        }
        answer = answer + map.get(s.charAt(s.length()-1));
        return answer;
    }
}
