package org.example.problems.two_pointers;

/*
    Given a string s, return true if it is a palindrome, otherwise return false.

    A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

    Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int startPointer = 0;
        int endPointer = s.length() - 1;

        while (startPointer < endPointer) {
            // Check for special characters and skip them
            if (!Character.isLetterOrDigit(s.charAt(startPointer))) {
                startPointer++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(endPointer))) {
                endPointer--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(startPointer)) != Character.toLowerCase(s.charAt(endPointer))) {
                return false;
            }

            startPointer++;
            endPointer--;
        }

        return true;
    }
}
