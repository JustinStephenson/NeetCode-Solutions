package org.example.problems.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 0;
        int maxLength = 0;
        int tempLength = maxLength;

        Set<Character> characterSet = new HashSet<>();

        for (; rightPointer < s.length(); rightPointer++) {
            Character currentChar = s.charAt(rightPointer);
            tempLength++;
            if (characterSet.add(currentChar)) {
                maxLength = Math.max(maxLength, tempLength);
            } else {
                while (characterSet.contains(currentChar)) {
                    characterSet.remove(s.charAt(leftPointer));
                    leftPointer++;
                    tempLength--;
                }
                characterSet.add(currentChar);
            }
        }

        return maxLength;
    }
}
