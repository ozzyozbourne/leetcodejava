package org.example.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSumAscending {

    public static void main(String[] args) {
        System.out.println(subsetSum(new int[]{1,2}));
    }

    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> res =  generateSum(0, num, new ArrayList<>(), 0);
        Collections.sort(res);
        return res;
    }

    private static ArrayList<Integer> generateSum(int index, int[] num, ArrayList<Integer> res, int sum ){
        if(index == num.length){
            res.add(sum);
            return res;
        }res =  generateSum(index + 1, num, res, sum);
        sum += num[index];
        res =  generateSum(index + 1, num, res, sum);
        sum -= num[index];
        return res;
    }
}
