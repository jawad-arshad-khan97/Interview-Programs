package programs;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static Map<Integer, Integer> countDuplicates(int[] a){

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i =0; i< a.length; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            } else {
                map.put(a[i], 1);
            }
        }
        return map;
    }

    public static void main(String[] args){
        int[] a = {1,3,2,2,4,2,1,3,5,6,3,2,3,21,4,33,2,1};
        Map<Integer, Integer> map = countDuplicates(a);

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("num: " + entry.getKey() + " count: " + entry.getValue());
            }

        }
    }
}
