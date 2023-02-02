package org.example.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordConcatenation {

    public static void main(String[] args) {

    }

    public static List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);

        List<Integer> res = new ArrayList<>();
        int wordCount = words.length, wordLength = words[0].length();
        for (int i = 0; i <= s.length() - wordCount * wordLength; i++){
            Map<String, Integer> wordSeen = new HashMap<>();
            for(int j = 0; j < wordCount; j++) {
                int nextWordIndex = i + j * wordLength;
                String word = s.substring(nextWordIndex, nextWordIndex + wordLength);
                if (!wordFrequency.containsKey(word)) break;
                wordSeen.put(word, wordSeen.getOrDefault(word, 0) + 1);
                if (wordSeen.get(word) > wordFrequency.get(word)) break;
                if (j + 1 == words.length) res.add(i);
            }
        }
        return res;
    }
}
