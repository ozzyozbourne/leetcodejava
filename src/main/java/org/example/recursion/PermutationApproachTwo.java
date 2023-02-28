package org.example.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationApproachTwo {

    private final List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        gen(0, nums);
        return res;
    }

    private void gen(int index, int [] arr) {
        if(index == arr.length) {
            res.add(Arrays.stream(arr).boxed().toList());
            return;
        }
        for(int i = index; i < arr.length; i++){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            gen(index + 1, arr);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
