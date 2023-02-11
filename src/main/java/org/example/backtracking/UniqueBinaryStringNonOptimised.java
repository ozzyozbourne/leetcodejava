package org.example.backtracking;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class UniqueBinaryStringNonOptimised {

    public String findDifferentBinaryString(String[] nums) {
        var givenNumbersSet = new HashSet<String>();
        Collections.addAll(givenNumbersSet, nums);
        var allBinaryStrSet = new HashSet<String>();
        generateBinaryStrings("", "", nums.length, allBinaryStrSet, givenNumbersSet);
        return allBinaryStrSet.stream().findFirst().get();
    }

    private static void generateBinaryStrings(String s, String t, int l, Set<String> set, Set<String> givenNumbersSet) {
        if(s.length()==l){
            if(!givenNumbersSet.contains(s)) {
                set.add(s);
                return;
            }return;
        }
        s+=t;
        generateBinaryStrings(s, "1", l, set, givenNumbersSet);
        generateBinaryStrings(s, "0", l, set, givenNumbersSet);
    }

    public static void main(String[] args) {
        var s = new UniqueBinaryString();
        System.out.println(s.findDifferentBinaryString(new String[]{"111","011","001"}));
    }
}
