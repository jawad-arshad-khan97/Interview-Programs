package programs;

public class FirstNonRepeatingCharacter {

    static final int MAX_CHAR = 26;

    public static char getFirstNonRepeatingCharacter(String str){
        int[] freq = new int[MAX_CHAR];

        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }

        for(int i=0; i<str.length(); i++){
            if(freq[str.charAt(i)-'a'] == 1){
                return str.charAt(i);
            }
        }

        return '$';
    }

    public static void main(String[] args){
        String s = "racecar";

        System.out.println(getFirstNonRepeatingCharacter(s));

    }
}
