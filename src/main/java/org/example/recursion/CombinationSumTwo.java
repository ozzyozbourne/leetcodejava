package org.example.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {

    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> r = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        gen(0, target, candidates);
        return res;
    }

    private void gen(int i, int t, int[] arr){
        if(t == 0){
            res.add(new ArrayList<>(r));
            return;
        }for(int j = i; j < arr.length; j++){
            if(j > i && arr[j] == arr[j-1])continue;
            if(arr[j] > t)break;
            r.add(arr[j]);
            gen(j + 1, t - arr[j], arr);
            r.remove(r.size()-1);
        }
    }

    public static void main(String[] args) {
        var ds = new CombinationSumTwo();
        System.out.println(ds.combinationSum2( new int[]{2,5,2,1,2}, 5));
    }
}
