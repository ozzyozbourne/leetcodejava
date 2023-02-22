package org.example.easy;

public class IsPalindromeString {

    public boolean isPalindrome(String s) {
        var ch = new StringBuilder(s.toLowerCase().replaceAll("[^A-Za-z0-9]", ""));
        return ch.toString().equals(ch.reverse().toString());
    }
}
