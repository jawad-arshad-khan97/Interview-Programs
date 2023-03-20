package programs;

import java.util.ArrayList;
import java.util.List;

public class CountSwaps {
    static class Result {

        /*
         * Complete the 'countSwaps' function below.
         *
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public void countSwaps(List<Integer> a) {

            int temp=0;
            int count=0;


            for (int i = 0; i < a.size(); i++) {

                for (int j = 0; j < a.size() - 1; j++) {
                    // Swap adjacent elements if they are in decreasing order
                    if (a.get(j) > a.get(j+1)) {
                        temp=a.get(j);
                        a.set(j, a.get(j+1));
                        a.set(j+1, temp);
                        count++;
                    }
                }

            }

            // Write your code here
            System.out.println("Array is sorted in "+count+" swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: "+a.get(a.size() -1));

        }

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(6);
        a.add(4);
        a.add(1);
        Result result = new Result();
        result.countSwaps(a);
    }

    }
