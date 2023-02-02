package org.example.fourteen;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.Function;

public class KClosestPointToOrigin {

    public static void main(String[] args) {

    }

    public  int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a , b) -> dist(b) - dist(a));
        for (int [] point: points) {
            queue.add(point);
            if (queue.size() > k) queue.remove();
        }
        int[][] res = new int[k][];
        int i = 0;
        while (!queue.isEmpty()) res[i++] = queue.poll();
        return res;
    }

     private int dist(int[] a) {return (a[0] * a[0]) + (a[1] * a[1]);}
}
