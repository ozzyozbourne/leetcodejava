package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {

    private static final List<Integer> res = new ArrayList<>();

    public static void generateAllSubSequences(int index, int [] arr){
        if(index == arr.length){
            System.out.println(res);
            return;
        }
        res.add(arr[index]);
        generateAllSubSequences(index + 1, arr);
        res.remove(res.size() - 1);
        generateAllSubSequences(index + 1, arr);
    }

    public static void main(String[] args) {
        generateAllSubSequences(0, new int[] {1,2,3});
    }
}
