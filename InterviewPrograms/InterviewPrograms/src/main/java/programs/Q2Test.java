package programs;

//Input = [0,1,0,2,0,3,0,4,0,5,0]
//Output = [1,2,3,4,5,0,0,0,0,0]

public class Q2Test {


    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        if (str1.equals(str2)) {
            return true;
        }


            int[] frqArr1 = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                frqArr1[c - 'a']++;
            }

            for (int i = 0; i < str2.length(); i++) {
                char c = str2.charAt(i);
                frqArr1[c - 'a']--;
            }

            for (int i = 0; i < frqArr1.length; i++) {
                if (frqArr1[i] >= 1) {
                    return false;
                }
            }

            return true;

    }


    public int[] shiftZerosToRight(int[] arr){
        int zeroCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroCount++;
            }
        }

        int[] res = new int[arr.length];
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                res[j]=arr[i];
                j++;
            }
        }

        int n = (j+1)+ zeroCount;

        for(int i=(j+1); i<n; i++){
            res[i]=0;
        }

        return res;
    }

    public static void main(String[] args){
//        care = race
//        Messages addressed to "meeting group chat" will also appear in the meeting group chat in Team Chat
//
//        KoJa1512 5:10 PM (Edited)
//        players = parsley
//
//        KoJa1512 5:10 PM
//                aabbbcc = abc

        Boolean anagramResult = isAnagram("players","parsley");
        System.out.println(anagramResult);












//        int[] arr = {0,1,0,2,0,3,0,4,0,5,0};
//        Q2Test test = new Q2Test();
//        int[] result = test.shiftZerosToRight(arr);
//        String res = "";
//
//        for(int i=0; i<result.length; i++){
//            res+= result[i] + ",";
//        }
//
//        System.out.println(res);
    }





}
