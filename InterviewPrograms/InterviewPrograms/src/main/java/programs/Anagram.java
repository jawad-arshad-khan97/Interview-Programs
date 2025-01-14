package programs;

public class Anagram {

    public static boolean isAnagram(String str1, String str2){
        int[] arr = new int[26];

        for(int i=0; i< str1.length(); i++){
            arr[str1.charAt(i)-'a']++;
        }
        for(int i=0; i< str2.length(); i++){
            arr[str2.charAt(i)-'a']--;
        }

        for (int i: arr){
            if(i!=0) return false;
        }

        return true;
    }
}
