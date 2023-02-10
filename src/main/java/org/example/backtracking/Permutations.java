package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    private final List<List<Integer>> d2 = new ArrayList<>();
    private final List<Integer>       d1 = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        var grd = new boolean [nums.length];
        findPerm(nums, grd);
        return d2;
    }

    private void findPerm(int[] nums, boolean[] grd){
        if (d1.size() == nums.length) {
            d2.add(new ArrayList<>(d1));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if (!grd[i]) {
                grd[i] = true;
                d1.add(nums[i]);
                findPerm(nums, grd);
                d1.remove(d1.size()-1);
                grd[i] = false;
            }
        }
    }
}
