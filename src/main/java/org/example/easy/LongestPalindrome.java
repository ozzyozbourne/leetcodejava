package org.example.easy;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        var char_count = new char[128];
        for(var ch : s.toCharArray()) char_count[ch]++;
        int result = 0;
        for(var count: char_count){
            result+= count/2 * 2;
            if (result%2 == 0 && count %2 == 1) result+=1;
        }return result;
    }
}
