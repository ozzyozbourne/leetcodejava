package org.example.fourteen;

import java.util.PriorityQueue;

public class ThirdMaxNumber {

    public static void main(String[] args) {

    }

    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num: nums) {
            if (!queue.contains(num))queue.add(num);
            if (queue.size() > 3)queue.remove();
        }if (queue.size() == 2) queue.remove();
        return queue.remove();
    }
}
