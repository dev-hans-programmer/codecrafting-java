package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * 383. Ransom Note
Solved
Easy
Topics
Companies
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 * 
 */

public class RansomNote {
    public static void main(String[] args) {
        String ransom = "aa";
        String magazine = "aab";

        System.out.println(canConstruct(ransom, magazine));
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        // FInd the freq of characters in both string;
        Map<Character, Integer> ransomFreq = new HashMap<>();
        Map<Character, Integer> magazineFreq = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            ransomFreq.put(ransomNote.charAt(i), ransomFreq.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineFreq.put(magazine.charAt(i), magazineFreq.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : ransomFreq.entrySet()) {
            char currentChar = entry.getKey();
            int currentValue = entry.getValue();

            if (!magazineFreq.containsKey(currentChar) || currentValue > magazineFreq.get(currentChar))
                return false;
        }

        return true;

    }
}
