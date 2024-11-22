package org.example.problems.arrays;

/*
    Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

    An anagram is a string that contains the exact same characters as another string,
    but the order of the characters can be different.
 */

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
