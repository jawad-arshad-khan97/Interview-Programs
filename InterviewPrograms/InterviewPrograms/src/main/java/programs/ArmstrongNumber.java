package programs;

public class ArmstrongNumber {

    public static boolean isArmstrong(int n) {
        String num = Integer.toString(n);
        int l = num.length();

        int sum = 0;

        for(int i=0; i<l; i++){
            sum = (int) (sum + Math.pow(Character.getNumericValue(num.charAt(i)), l));
        }

        return sum == n;
    }
}
