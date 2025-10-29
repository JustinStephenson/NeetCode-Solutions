package org.example.problems.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0,
    and the indices i, j and k are all distinct.

    The output should not contain any duplicate triplets. You may return the output and the triplets in any order.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;

            while (leftPointer < rightPointer) {
                if (leftPointer > i + 1 && nums[leftPointer] == nums[leftPointer - 1]) {
                    leftPointer++;
                    continue;
                }
                if (rightPointer < nums.length - 1 && nums[rightPointer] == nums[rightPointer + 1]) {
                    rightPointer--;
                    continue;
                }

                int sum = nums[i] + nums[leftPointer] + nums[rightPointer];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[leftPointer], nums[rightPointer]));
                }
                if (sum < 0) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }

        return result;
    }
}
