package org.example.easy;

public class ReverseStringOnOnRec {

    public void reverseString(char[] s) {
        rec(s, 0, s.length - 1);
    }

    private void rec(char [] s, int l, int r){
        if (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            rec(s, l+1, r-1);
        }
    }
}
