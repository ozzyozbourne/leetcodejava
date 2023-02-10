package org.example.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationsTwo {

    private final List<List<Integer>>    d2 = new ArrayList<>();
    private final List<Integer>          d1 = new ArrayList<>();
    private final Map<Integer, Integer>  fq = new HashMap<>();

    public static void main(String[] args) {
        var t = new PermutationsTwo();
        System.out.println( t.permuteUnique(new int[] {1,1,2}));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        for (var num: nums) fq.put(num, fq.getOrDefault(num, 0) + 1);
        findPerm(fq.keySet().toArray(new Integer[fq.size()]), nums.length);
        return d2;
    }

    private void findPerm(Integer[] nums, int l){
        if (d1.size() == l) {
            d2.add(new ArrayList<>(d1));
            return;
        }
        for (var num : nums) {
            if (fq.get(num) > 0) {
                fq.put(num, fq.get(num) - 1);
                d1.add(num);
                findPerm(nums, l);
                d1.remove(d1.size() - 1);
                fq.put(num, fq.get(num) + 1);
            }
        }
    }
}
