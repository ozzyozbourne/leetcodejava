package org.example.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {

    private final static Stack<Character> stack = new Stack<>();
    private final static List<String>     res   = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        generateAllParen(n, 0, 0);
        return res;
    }

    private static void generateAllParen(int n, int open, int close){

        if (open == close && open == n){
            var builder = new StringBuilder(stack.size());
            for(var s : stack.toArray()) builder.append(s);
            res.add(builder.toString());
        }

        if (open < n){
            stack.push('(');
            generateAllParen(n, open + 1, close);
            stack.pop();
        }

        if (close < open){
            stack.push(')');
            generateAllParen(n, open, close + 1);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}
