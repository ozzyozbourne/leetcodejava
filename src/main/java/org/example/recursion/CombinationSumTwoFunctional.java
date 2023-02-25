package org.example.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwoFunctional {

    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> r = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        gen(0, 0, target, candidates);
        return res;
    }

    private void gen(int i, int j, int t, int[] arr){
        if(j == arr.length || i == arr.length || t == 0 ||arr[i] > t){
            if(t == 0){
                if(res.contains(r)) return;
                res.add(new ArrayList<>(r));}
            return;
        }if(i > j && arr[i] == arr[i-1])gen(i + 1, j, t, arr);
        r.add(arr[i]);
        gen(i + 1, i + 1, t - arr[i], arr);
        r.remove(r.size()-1);
        gen(i + 1, j, t, arr);
    }

    public static void main(String[] args) {
        var ds = new CombinationSumTwoFunctional();
        System.out.println(ds.combinationSum2( new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 27));
    }
}
