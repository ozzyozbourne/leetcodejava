package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> r = new ArrayList<>();
    private int sum = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        gen(0,target, candidates);
        return res;
    }

    private void gen(int i, int t, int[] arr){
        if(i == arr.length || sum >= t){
            if(sum == t) res.add(new ArrayList<>(r));
            return;
        } r.add(arr[i]);
        sum+= arr[i];
        gen(i, t, arr);
        r.remove(r.size() - 1);
        sum-=arr[i];
        gen(i + 1, t, arr);
    }
}
