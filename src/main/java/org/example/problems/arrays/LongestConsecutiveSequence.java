package org.example.problems.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;

        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int currentSequence = 1;
                while (numsSet.contains(num + currentSequence)) {
                    currentSequence++;
                }
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }
}
