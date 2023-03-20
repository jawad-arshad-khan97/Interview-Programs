package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetTargetSumPairs {
    public void getPairs(int[] arr, int target) {


        HashMap<Integer, Integer> map = new HashMap<>();
        int difference = 0;
        List<Integer> list = new ArrayList<>();


        if (arr.length < 2) {
            System.out.println("inv");
        }


        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            difference = target - arr[i];
            if (map.containsKey(difference)) {
                list.add(i);
//                list.add(map.get(difference));
            }
        }
        System.out.println(list);

    }
}
