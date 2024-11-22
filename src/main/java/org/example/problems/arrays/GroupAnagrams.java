package org.example.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
    Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

    An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 */

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> resultMap = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            resultMap.putIfAbsent(key, new ArrayList<>());
            resultMap.get(key).add(str);
        }

        return new ArrayList<>(resultMap.values());
    }
}
