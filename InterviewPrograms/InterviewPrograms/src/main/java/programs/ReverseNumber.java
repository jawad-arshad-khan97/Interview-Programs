package programs;

public class ReverseNumber {

    //string buffer approach
    public int reverseNumUsingString(int num){
        StringBuffer s = new StringBuffer(String.valueOf(num));
        s.reverse();

        num = Integer.parseInt(String.valueOf(s));
        return num;
    }

    public int reverseNumberUsingLoop(int num){
        int reverse = 0;
        while(num >0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        return reverse;
    }

    public static void main(String[] args)
    {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverseNumberUsingLoop(7654));
        System.out.println(reverseNumber.reverseNumUsingString(7654));
    }
}
