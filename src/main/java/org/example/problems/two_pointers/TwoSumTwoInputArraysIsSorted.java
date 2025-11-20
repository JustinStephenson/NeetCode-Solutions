package org.example.problems.two_pointers;

/*
    Given an array of integer numbers that is sorted in non-decreasing order.

    Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2.
    Note that index1 and index2 cannot be equal, therefore, you may not use the same element twice.

    There will always be exactly one valid solution.
 */
public class TwoSumTwoInputArraysIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {
            int addition = numbers[leftPointer] + numbers[rightPointer];
            if (addition == target) {
                return new int[]{leftPointer + 1, rightPointer + 1};
            }

            if (addition < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return new int[]{};
    }
}
