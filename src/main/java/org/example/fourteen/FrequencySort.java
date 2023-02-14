package org.example.fourteen;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static String frequencySort(String s) {
        var maxHeap = new PriorityQueue<Map.Entry<Character, Integer>>((a, b) -> b.getValue()-a.getValue());
        var fm = new HashMap<Character, Integer>();
        var sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) fm.put(s.charAt(i), fm.getOrDefault(s.charAt(i),0 ) + 1);
        maxHeap.addAll(fm.entrySet());
        while (!maxHeap.isEmpty()){
            var ks = maxHeap.poll();
            sb.append(String.valueOf(ks.getKey()).repeat(ks.getValue()));
        }return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
