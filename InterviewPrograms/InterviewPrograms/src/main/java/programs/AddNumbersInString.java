package programs;

import java.util.ArrayList;
import java.util.List;

public class AddNumbersInString {

//    Special Characters(32–47 / 58–64 / 91–96 / 123–126)
//    Numbers (30–39): 65-90

//    public String ifSpecialCharacterOrNumberPresent(String s){
//
//        char str[] = s.toCharArray();
//        int count = 0;
//
//        for(int i=0; i< str.length;i++){
//            if(!(str[i] >= 65 && str[i] <= 90)  && (str[i] >= 97 && str[i] <= 122)){
//                count++;
//                }
//            }
//
//        if(count>0){
//            return "yes";
//        } else
//            return "no";
//    }



//    public int giveTheSmallestMissingPosNumber(int[] arr) {
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            list.add(0);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                list.set(i, 1);
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (list.get(i) == 0) {
//                return arr[i];
//            }
//        }
//        return 0;
//    }


    public int addNumber(String str) {
        char[] arr=str.toCharArray();
        int sum=0;
        List<Integer> list = new ArrayList<>();


        for(int i=0;i<arr.length;i++){
            if(!Character.isAlphabetic(arr[i])){
                sum=(sum*10)+ (arr[i]-'0');//this converts character to int
            }
            if(Character.isAlphabetic(arr[i])){
                list.add(sum);
                sum=0;
                continue;
            }

            if(i==arr.length-1){
                list.add(sum);
            }
        }

        int res=0;
        for(int i=0;i<list.size();i++){
            res = res+list.get(i);
        }

        return res;

    }


        public static void main(String[] args){
            AddNumbersInString testNow = new AddNumbersInString();
//            int[] a = {2, 3, 7, 6, 8, -1, -10, 15};
            int i=testNow.addNumber("1Jawad456Khan23");
            System.out.println(i);


        }

}
