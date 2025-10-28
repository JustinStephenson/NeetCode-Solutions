package org.example.problems.two_pointers;

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
