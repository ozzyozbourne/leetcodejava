package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> sub = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subsetsGetter(nums, 0);
        return res;
    }

    void subsetsGetter(int[] nums, int i){
        if (i >= nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        subsetsGetter(nums , i + 1);

        sub.remove(sub.size() - 1);
        subsetsGetter(nums , i + 1);

    }
}
