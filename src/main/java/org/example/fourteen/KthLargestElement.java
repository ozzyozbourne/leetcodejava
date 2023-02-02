package org.example.fourteen;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int a : nums){
            p.add(a);
            if(p.size() > k)
                p.remove();
        } return p.remove();
    }
}
