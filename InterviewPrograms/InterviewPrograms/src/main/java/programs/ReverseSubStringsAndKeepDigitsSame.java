package programs;

public class ReverseSubStringsAndKeepDigitsSame {

    public static void getResult() {
        String input = "test12pop90java989pyt";
        String result = "";
        String stringToBeReversed = "";
        String reversedString = "";
        char arr[] = input.toCharArray();

        int l = 0;
        int r = 0;


        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) {
                stringToBeReversed += arr[i];
            }

            if (!Character.isAlphabetic(arr[i])) {
                result += giveReversedString(stringToBeReversed) + arr[i];
                stringToBeReversed="";
            }

            if(i== arr.length-1){
                result+= giveReversedString(stringToBeReversed);

            }


        }

        System.out.println(result);
    }


        public static String giveReversedString(String toBeReversed){
            String res = "";

            for(int i =toBeReversed.length()-1; i>=0; i--){
                res+= toBeReversed.charAt(i);
            }

            return res;


        }


        public static void main(String[] args){

//        getResult();
            System.out.println(9/0);

        }




    }

