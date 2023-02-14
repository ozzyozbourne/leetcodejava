package org.example.fourteen;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinDistinctElements {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        if(k == arr.length) return 0;
        if(k == arr.length - 1) return 1;

        var fm = new HashMap<Integer, Integer>();
        for (var num: arr) fm.put(num, fm.getOrDefault(num, 0) + 1);
        var unique = fm.size();
        var minHeap=new PriorityQueue<Map.Entry<Integer, Integer>>(Comparator.comparingInt(Map.Entry::getValue));

        for(var keyValSet: fm.entrySet()){
            if(keyValSet.getValue() == 1 && k > 0){
                k--;
                unique--;
            }else minHeap.add(keyValSet);
        }
        while(!minHeap.isEmpty() && k > 0){
            var kv = minHeap.poll();
            k -= kv.getValue();
            if ( k >= 0) unique--;
        }return unique;
    }

    public static void main(String[] args) {
        System.out.println(findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3));
    }
}
