package org.example.fourteen;

import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        var minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(Comparator.comparingInt(Map.Entry::getValue));
        var map = new HashMap<Integer, Integer>();
        for(var num: nums)map.put(num, map.getOrDefault(num, 0) + 1);
        for(var kv: map.entrySet()){
            minHeap.add(kv);
            if (minHeap.size() > k) minHeap.poll();
        }var res = new int[k];
        while (!minHeap.isEmpty())res[minHeap.size()-1] = minHeap.poll().getKey();
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1 , 1, 1, 2, 2, 3}, 2)));
    }
}
