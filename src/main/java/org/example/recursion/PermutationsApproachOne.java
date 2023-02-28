package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsApproachOne {

    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> ds = new ArrayList<>();
    private boolean [] bitMap;

    public List<List<Integer>> permute(int[] nums) {
        bitMap = new boolean[nums.length];
        gen(nums);
        return res;
    }

    private void gen(int arr[]) {
        if(ds.size() == arr.length) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < arr.length; i++)
            if(!bitMap[i]){
                ds.add(arr[i]);
                bitMap[i] = true;
                gen(arr);
                ds.remove(ds.size() - 1);
                bitMap[i] = false;
            }
    }
}
