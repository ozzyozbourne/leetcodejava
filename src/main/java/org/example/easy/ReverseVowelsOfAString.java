package org.example.easy;

import java.util.Set;

public class ReverseVowelsOfAString {

    private final static Set<Character> charSet = Set.of('a', 'e', 'i','o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static String reverseVowels(String s) {
      var ch = s.toCharArray();
      int left = 0, right = s.length()-1;
      while (left < right) {
          if(charSet.contains(ch[left])){
              while (!charSet.contains(ch[right]) && left < right) right--;
              var temp = ch[left];
              ch[left] = ch[right];
              ch[right--] = temp;
          }left++;
      }return String.valueOf(ch);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
