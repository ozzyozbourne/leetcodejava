package org.example.learning;

import java.util.ArrayList;
import java.util.List;

public class subsets {

    private static final List<Integer> res = new ArrayList<>();
    private static final int []        arr = new int[]{3,1,2};

    private static void printAllSubSequences(int index){
        if(index == arr.length){
            System.out.println(res);
            return;
        }
        res.add(arr[index]);
        printAllSubSequences(index+1);
        res.remove(res.size() - 1);
        printAllSubSequences(index+1);
    }

    public static void main(String[] args) {
        printAllSubSequences(0);
        System.out.println(res);
    }
}
