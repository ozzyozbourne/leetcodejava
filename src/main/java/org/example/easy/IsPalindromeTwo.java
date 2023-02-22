package org.example.easy;

public class IsPalindromeTwo {

    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)){
                var leftSubString  = s.substring(left, right);
                var rightSubString = s.substring(left + 1, right + 1);
                var one = new StringBuilder(leftSubString);
                var two = new StringBuilder(rightSubString);
                return (leftSubString.equals(one.reverse().toString())) || (rightSubString.equals(two.reverse().toString()));
            } left++; right--;
        }return true;
    }
}
