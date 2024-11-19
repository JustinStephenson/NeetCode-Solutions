package org.example.problems.arrays;

/*
    Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 */

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
