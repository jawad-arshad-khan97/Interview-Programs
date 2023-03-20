package programs;

public class MaxAdjacentRobbery {
    //   [2,7,9,3,1]
    //[2]
    //[1, 2]
    //[1,2,3]  i

    public void maxRob(int[] a){

        int j=1;
        int sum1=0,sum2=0;
        int max=0;

        if(a.length==1){
            System.out.println(a[0]);
        }

        for(int i=0; i<a.length; i++){

            sum1+= a[i];
            i=i+1;

            if(j<a.length-3) {

                sum2 += a[j];
                j = j + 2;
            }



        }

        max=Math.max(sum1, sum2);
        System.out.println(max);


    }

}
