package org.example.easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int sum = 0, temp = x;
        while (x > 0){
            sum = (sum * 10) + x % 10;
            x/=10;
        }return sum == temp?true:false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1410110141));
    }
}
