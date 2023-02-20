package org.example.stack;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private static final Map<Character, Character> map = Map.of('}', '{', ']', '[', ')', '(');

    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            var charAti = s.charAt(i);
            if (map.containsKey(charAti)){
                if (!stack.isEmpty() && stack.peek().equals(map.get(charAti)))
                    stack.pop();
                else return false;
            }else stack.push(charAti);
        }if(stack.isEmpty()) return true;
        return false;
    }
}
