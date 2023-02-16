package org.example.thirteen;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int num = 0;
        for (var n: nums) num = num ^ n;
        return num;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}));
    }
}
