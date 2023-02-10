package org.example.backtracking;

import java.util.*;

public class UniqueBinaryString {

    private final List<String> setActual = new ArrayList<>();
    private String allBinaryStrSet;

    public String findDifferentBinaryString(String[] nums) {
        Collections.addAll(setActual, nums);
        generateBinaryStrings(0, "");
        return allBinaryStrSet;
    }

    private void generateBinaryStrings(int s, String t) {
        if(s == setActual.size()){
            if(!setActual.contains(t)) {
                allBinaryStrSet = t;
                return;
            } return;
        }
        generateBinaryStrings(s +1,t+"1");
        if (allBinaryStrSet != null) return;
        generateBinaryStrings(s +1,t+"0");
        if (allBinaryStrSet != null) return;
    }

    public static void main(String[] args) {
        var s = new UniqueBinaryString();
        System.out.println(s.findDifferentBinaryString(new String[]{"111","011","001"}));
    }
}
