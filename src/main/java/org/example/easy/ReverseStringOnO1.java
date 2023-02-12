package org.example.easy;

public class ReverseStringOnO1 {

   static public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while(l < r){
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
    }

    public static void main(String[] args) {
        reverseString(new char[] {'o', 's', 'a', 'i', 'd'});
    }
}
