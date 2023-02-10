package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    private final static Map<Character, String> keyPad = Map.of(
            '2', "abc", '3', "def",  '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    private final List<String> res = new ArrayList<>();
    private final StringBuffer sb  = new StringBuffer();

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return res;
        dfs(digits, 0);
        return res;
    }

    private void dfs(String digits, int i){
        if (sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }
        String v = keyPad.get(digits.charAt(i));
        for(int j = 0; j < v.length(); j++){
            sb.append(v.charAt(j));
            dfs(digits, i + 1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
