package org.example.easy;

import java.util.Stack;

public class ReverseStringOnOn {

    public void reverseString(char[] s) {
        var chStack = new Stack<Character>();
        for(var ch : s)chStack.push(ch);
        int i = 0;
        while (!chStack.empty())s[i++] = chStack.pop();
    }
}
