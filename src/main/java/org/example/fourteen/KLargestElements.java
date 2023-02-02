package org.example.fourteen;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        System.out.println(getKLargest(new int[]{3, 4, 7, 10, 15, 14}, 3));
    }

    public static List<Integer> getKLargest(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        for(int num :nums) {
            queue.add(num);
            if (queue.size() > k) queue.remove();
        }
        while (queue.size() > 0) {
            list.add(queue.remove());
        }
        return list;
    }
}
