package org.example.problems.binary_search;

import java.util.Arrays;

/*
    You are given an array of distinct integers nums, sorted in ascending order, and an integer target.

    Implement a function to search for 'target' within nums. If it exists, then return its index, otherwise, return -1.

    Your solution must run in O(logn)O(logn) time.
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        // return binarySearchRecursive(0, nums.length - 1, nums, target);
        return binarySearchIterative(nums, target);
        // return binarySearchBuiltIn(nums, target);
    }

    public int binarySearchRecursive(int left, int right, int[] nums, int target) {
        if (left > right) {
            return -1;
        }
        int middle = left + (right - left) / 2;

        if (nums[middle] == target) {
            return middle;
        }

        if (nums[middle] < target) {
            return binarySearchRecursive(middle + 1, right, nums, target);
        } else {
            return binarySearchRecursive(left, middle - 1, nums, target);
        }
    }

    public int binarySearchIterative(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public int binarySearchBuiltIn(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index >= 0 ? index : -1;
    }
}
