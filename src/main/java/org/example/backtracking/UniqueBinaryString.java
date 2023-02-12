package org.example.backtracking;

import java.util.*;

public class UniqueBinaryString {

    private final Set<String>  set = new HashSet<>();
    private final StringBuilder sb = new StringBuilder();

    public String findDifferentBinaryString(String[] nums) {
        Collections.addAll(set, nums);
        generateBinaryStrings(0);
        return sb.toString();
    }

    private boolean generateBinaryStrings(int s) {
        if(s == set.size()) return !set.contains(sb.toString());

        sb.append('1');
        if (generateBinaryStrings(s + 1)) return true;
        sb.deleteCharAt(sb.length()-1);

        sb.append('0');
        if (generateBinaryStrings(s + 1)) return true;
        sb.deleteCharAt(sb.length()-1);

        return false;
    }

    public static void main(String[] args) {
        var s = new UniqueBinaryString();
        System.out.println(s.findDifferentBinaryString(new String[]{"111","011","001"}));
    }
}
