package org.example.fourteen;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {
        System.out.println(findKthSmallest(new int[]{1, 5, 12, 2, 11, 5}, 3));
        System.out.println(findKthSmallest(new int[]{1, 5, 12, 2, 11, 5}, 4));
        System.out.println(findKthSmallest(new int[]{5, 12, 11, -1, 12}, 3));
    }
    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num:nums) {
            queue.add(num);
            if (queue.size() > k) queue.remove();
        }
        return queue.remove();
    }
}
