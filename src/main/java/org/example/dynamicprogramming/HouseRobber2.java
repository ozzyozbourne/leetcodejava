package org.example.dynamicprogramming;

public class HouseRobber2 {

    public int rob(int[] nums) {
        return Math.max(rob(nums, 0, nums.length - 2), Math.max(rob(nums, 1, nums.length-1),nums[0] ));
    }

    public int rob(int[] nums, int start, int end) {
        int rob1 = 0, rob2 = 0;
        for (; start <= end; start++){
            int temp = Math.max(nums[start] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
