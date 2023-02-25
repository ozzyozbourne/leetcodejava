package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class FirstSubsequenceEqualToK {

    private final static List<Integer> res = new ArrayList<>();
    private static int sum = 0;

    public static boolean getSequence(int index, int [] arr, int k, boolean flag) {
        if(sum >= k || index == arr.length){
            if(sum == k) System.out.println(res);
            return sum == k;
        }sum+=arr[index];
        res.add(arr[index]);
        flag = getSequence(index + 1,arr, k, flag);
        if(flag) return true;
        sum-=arr[index];
        res.remove(res.size() - 1);
        flag =  getSequence(index + 1,arr, k, flag);

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(getSequence(0,  new int[]{1,2,3}, 3, false));
    }
}
