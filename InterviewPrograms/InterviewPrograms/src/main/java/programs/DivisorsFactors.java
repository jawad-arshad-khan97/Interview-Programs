package programs;

public class DivisorsFactors {

    public static void printDivisors(int n){

        for (int i=1; i<= (int)Math.sqrt(n); i++){
            if (n%i == 0){
                System.out.println(i + ",");
                if(i != n/i){
                    System.out.println(n/i + ",");
                }
            }

        }

    }

    public static void main(String[] args){
        printDivisors(100);
    }
}
