package org.example.fourteen;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxDistinctElements {

    public static int findMostNumOfUniqueInts(int[] arr, int k) {
        if (arr.length <= k) return arr.length;
        int distinct_count = 0;
        var minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(Comparator.comparingInt(Map.Entry::getValue));
        var fm = new HashMap<Integer, Integer>();
        for (var a: arr)fm.put(a, fm.getOrDefault(a, 0) + 1);
        for(var kv: fm.entrySet()){
            if (kv.getValue() == 1)distinct_count++;
            else minHeap.add(kv);
        }while (k > 0 && !minHeap.isEmpty()){
            var entryVal = minHeap.poll();
            k-= entryVal.getValue() - 1;
            if (k > 0) distinct_count++;
        }if (k>0)distinct_count -=k;
        return distinct_count;
    }

    public static void main(String[] args) {
        System.out.println(findMostNumOfUniqueInts(new int[]{7, 3, 5, 8, 5, 3, 3}, 2));
        System.out.println(findMostNumOfUniqueInts(new int[]{3, 5, 12, 11, 12}, 3));
        System.out.println(findMostNumOfUniqueInts(new int[]{1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5}, 2));
    }
}
