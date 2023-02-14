package org.example.learning;

import java.util.PriorityQueue;

public class heap {

    private final static PriorityQueue<Integer> heap = new PriorityQueue<>();

    public static void main(String[] args) {
        heap.add(1);
        heap.add(0);
        System.out.println(heap);
    }
}
