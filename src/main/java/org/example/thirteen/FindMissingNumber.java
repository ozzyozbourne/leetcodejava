package org.example.thirteen;

public class FindMissingNumber {

    public static int getMissing(int [] nums){
        int x1 = 0, x2 = 0;
        for(int i = 0; i <= nums.length; i++) x1 = x1 ^ i;
        for(var num : nums) x2 = x2 ^ num;
        return x1 ^ x2;
    }

    public static void main(String[] args) {
        System.out.println(getMissing(new int[]{3,0,1}));
    }
}
