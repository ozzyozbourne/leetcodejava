package org.example.dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class LongestIncreasingSubsequence {


    public static int lengthOfLIS(int[] nums) {
        var cache = new ArrayList<>(Collections.nCopies(nums.length, 1));
        for (int i = nums.length - 1; i >= 0; i--)
            for(int j = i + 1; j < nums.length; j++)
                if (nums[i] < nums[j]) cache.set(i, Math.max(cache.get(i), 1 + cache.get(j)));
        return Collections.max(cache);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
