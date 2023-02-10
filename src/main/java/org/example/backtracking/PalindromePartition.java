package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    private final List<List<String>> d2 = new ArrayList<>();
    private final List<String>       d1 = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(s, 0);
        return d2;
    }

    private void dfs(String s, int i){
        if (i >= s.length()){
            d2.add(new ArrayList<>(d1));
            return;
        }
        for(int j = i; j < s.length(); j++)
            if (isPalin(s, i, j)) {
                d1.add(s.substring(i, j+1));
                dfs(s, j+1);
                d1.remove(d1.size() - 1);
            }
    }

    private boolean isPalin(String s, int l, int r) {
        while (l < r)  if(s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
}
